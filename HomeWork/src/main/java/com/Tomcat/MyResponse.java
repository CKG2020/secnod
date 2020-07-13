package com.Tomcat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class MyResponse {

    private OutputStream outputStream;


    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

     public void write (String content) throws IOException {
         StringBuffer buffer = new StringBuffer();
         buffer.append("HTTP/1.1 200 OK\n")
                 .append("Content-Type: text/html\n")
                 .append("\r\n")
                 .append("<html><meta http-equiv=\"content-type\" " +
                         "content=\"text/html; charset=utf-8\"><body>")
                 .append(content)
                 .append("<body</html>");
         outputStream.write(new String(buffer.toString().getBytes(),"UTF-8").getBytes());

        outputStream.close();

     }




}
