package com.Tomcat;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {
    private  String url;
    private  String method;

    public MyRequest(InputStream inputStream) throws IOException {

      String httpRequest="";
        byte[] bytes = new byte[1024];

        int length=0;

        if ((length=inputStream.read(bytes))>0){
            httpRequest=new String (bytes,0,length);
        }
        String httpHead = httpRequest.split("\n")[0];
       url= httpHead.split("\\s")[1];
       method=httpHead.split("\\s")[0];
        System.out.println(this.toString());



    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }


    @Override
    public String toString() {
        return "MyRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
