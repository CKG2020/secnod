package com.Verfiy.Bio;

import io.netty.util.internal.ObjectUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        System.out.println("server has started-------------");
        while(!serverSocket.isClosed()){
            Socket accept = serverSocket.accept();
            System.out.println("sever has received"+accept.toString());
            InputStream inputStream = accept.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while((msg=bufferedReader.readLine())!=null){
                if (msg.length()==0){
                    break;
                }
                System.out.println(msg);
            }

            System.out.println("server has received a message from "+accept.toString());
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("HTTP/1.1 200 OKrr".getBytes("utf-8"));
            outputStream.write("Content-Length: 11rnrn".getBytes("utf-8"));
            outputStream.write("Hello World".getBytes("utf-8"));
            outputStream.flush();
            inputStream.close();
            outputStream.close();
            accept.close();

        }

     serverSocket.close();

    }
}
