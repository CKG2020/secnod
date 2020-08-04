package com.Verfiy.Bio;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.BatchUpdateException;
import java.util.Scanner;

public class BIOClient_S3 {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.setSoTimeout(10000);
        socket.connect(new InetSocketAddress(Inet4Address.getLocalHost(),10000));
        System.out.println("client startup");
        dealMsg(socket);
        socket.close();
    }

    private static void dealMsg(Socket clientsocket) throws IOException {
        InputStream systemin = System.in;
        BufferedReader systembufferedReader = new BufferedReader(new InputStreamReader(systemin));



        InputStream inputStream = clientsocket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));



        OutputStream outputStream = clientsocket.getOutputStream();
//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(outputStream));
        PrintStream printStream = new PrintStream(outputStream);


        boolean  flag=true;

        do{
            String str = systembufferedReader.readLine();
            printStream.println(str);


            String echo = bufferedReader.readLine();


            if ("bye".equalsIgnoreCase(echo)){
                flag=false;
            }

             else {
                System.out.println("server echo:"+echo);
            }

        }
          while (flag);
        bufferedReader.close();
        printStream.close();





    }
}
