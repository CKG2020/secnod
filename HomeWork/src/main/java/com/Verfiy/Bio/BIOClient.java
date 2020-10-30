package com.Verfiy.Bio;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class BIOClient {

   private static final Charset charset=Charset.forName("utf-8");

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        //  第一种     可以成功连接
//        Socket socket = new Socket("localhost",8080);
        /*
        *  第二种     下面这种不行
        * */
       socket.connect(new InetSocketAddress(Inet4Address.getLocalHost(),10000));

        // bind  用于绑定源信息  connect用于绑定目标信息
  //     socket.bind(new InetSocketAddress("localhost",8080));

        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input:");
        String msg = scanner.nextLine();
         outputStream.write(msg.getBytes(charset));
         scanner.close();
         outputStream.close();
         socket.close();
    }


}
