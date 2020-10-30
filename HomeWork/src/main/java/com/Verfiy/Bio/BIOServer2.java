package com.Verfiy.Bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class BIOServer2 {
    private static   ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
//        serverSocket.bind(new InetSocketAddress(8080));
        System.out.println("server has started>>>>>>>>>");
        while(!serverSocket.isClosed()){
            final Socket accept = serverSocket.accept();
            System.out.println("server has received "+accept.toString());
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    InputStream inputStream=null;
                    try {
                        inputStream=accept.getInputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String  msg=null;

                    while(true){
                        try {
                            if ((msg = bufferedReader.readLine()) == null){

                                break;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (msg.length()==0){
                            break;
                        }
                        System.out.println(msg);

                    }
                    System.out.println("server has received a message from"+accept.toString());
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }



            });




        }





    }


}
