package Dao;

import bean.MapperBean;
import mapper.Function1;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
            String  value = getValue(i);
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

    private String getValue(Element node){
        return node.hasContent()?node.getText():node.attributeValue("value");
    }

    @SuppressWarnings("rawtypes")
    public MapperBean readMapper(String path) throws DocumentException {

        MapperBean mapper = new MapperBean();
        InputStream stream = loder.getResourceAsStream(path);
        SAXReader reader = new SAXReader();
        Document document = reader.read(stream);
        Element root = document.getRootElement();

        mapper.setInterfaceName(root.attributeValue("namespace").trim());

        List<Function1> list = new ArrayList<>();
        for (Iterator rootIter=root.elementIterator();rootIter.hasNext();){

            Function1 fun = new Function1();
            Element e = (Element) rootIter.next();
            String sqltype = e.getName().trim();
            String funcName = e.attributeValue("id").trim();
            String sql = e.getText().trim();
            String resultType = e.attributeValue("resultType").trim();
            fun.setSqltype(sqltype);
            fun.setFuncName(funcName);
            Object   newIntance=null;

            try {
                newIntance=Class.forName(resultType).newInstance();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            fun.setResultType(newIntance);
            fun.setSql(sql);
            list.add(fun);
        }
        mapper.setList(list);
        return mapper;

    }


}
