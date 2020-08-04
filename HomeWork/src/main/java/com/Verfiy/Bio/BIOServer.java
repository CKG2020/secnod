package com.Verfiy.Bio;

import io.netty.bootstrap.ServerBootstrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress(8080));
        System.out.println("server has started");
        while(!serverSocket.isClosed()){
            Socket requestClient = serverSocket.accept();
            System.out.println("server get a connection:");
            InputStream requestinputStream = requestClient.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(requestinputStream));
            String msg;

      while((msg=reader.readLine())!=null){

          if (msg.length()==0){
              break;
          }
          System.out.println(msg);
      }


      System.out.println("Server has received a message from:"+requestClient.toString());
       requestinputStream.close();
       requestClient.close();

        }
serverSocket.close();


    }



}
