package com.Tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyTomcat {
    private int port;
    private Map<String,String> urlServletMap=new ConcurrentHashMap<>();

    public MyTomcat(int port, Map<String, String> urlServletMap) {
        this.port = port;
        this.urlServletMap = urlServletMap;
    }

    public MyTomcat(int i) {
        this.port=i;
    }

    private void initServletMapping(){
        for (ServletMapping servletMapping:ServletMappingConfig.servletMappingList){
            urlServletMap.put(servletMapping.getUrl(),servletMapping.getClazz());
        }
    }

    public void start(){
        ServerSocket serverSocket=null;
        initServletMapping();
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("MyTomcar is starting.............");
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                MyRequest myRequest = new MyRequest(inputStream);
                MyResponse myResponse = new MyResponse(outputStream);
                dispatch(myRequest, myResponse);
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null!=serverSocket){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println(:);


    }

    private void dispatch(MyRequest myRequest, MyResponse myResponse) {
         String clazz = urlServletMap.get(myRequest.getUrl());

        try {

            Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
            MyServlet myServlet = myServletClass.newInstance();
             myServlet.service(myRequest,myResponse);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new MyTomcat(8080).start();
    }


}
