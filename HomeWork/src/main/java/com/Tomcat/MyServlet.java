package com.Tomcat;

public  abstract class MyServlet {
    public abstract void doGet(MyRequest request,MyResponse response);
    public abstract  void doPost(MyRequest request,MyResponse response);
    public  void service(MyRequest request,MyResponse response){
        if ("POST".equalsIgnoreCase(request.getMethod())){
            doPost(request,response);
        }
        else if ("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }
    }


}
