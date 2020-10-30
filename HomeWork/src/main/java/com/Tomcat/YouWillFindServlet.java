package com.Tomcat;

import java.io.IOException;

public class YouWillFindServlet extends MyServlet
{
    @Override
    public void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("method:GET you are GET method");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {


        try {
            response.write("method:POST you are POST method");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
