package com;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static javax.xml.bind.JAXBIntrospector.getValue;

public class MyConfiguration {
    private static ClassLoader loder=ClassLoader.getSystemClassLoader();
    public Connection build(String resource) {
        try {
            InputStream stream = loder.getResourceAsStream(resource);
            SAXReader reader = new SAXReader();
            Document document = reader.read(stream);
            Element root = document.getRootElement();
            return evalDataSource(root);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Connection evalDataSource(Element node) throws ClassNotFoundException {
        if (!node.getName().equals("database")){
            throw new RuntimeException("root should be <database>");
        }
        String driverClassName=null;
        String url=null;
        String username=null;
        String password=null;
        for (Object item:node.elements("property")){

            Element i= (Element) item;
            String  value = (String) getValue("i");
            String name = i.attributeValue("name");
            if (name==null||value==null){
                throw new RuntimeException("[database]:<property> should contain name and value");
            }

            switch (name){
                case "url":url=value;break;
                case "username":username=value;break;
                case "password":password=value;break;
                case "driverClassName":driverClassName=value;break;

            }
        }
          Class.forName(driverClassName);
        Connection connection=null;
        try{
            connection= DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  connection;

    }

}
