package com;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetAddress01 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());
            InetAddress inetAddress1=InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress1.getAddress());
            System.out.println(inetAddress1.getHostName());

            System.out.println("=====================");

            InetSocketAddress add=new InetSocketAddress("127.0.0.1",6379);
            System.out.println(add.getHostName());
            System.out.println(add.getPort());
            InetAddress addr=add.getAddress();//获得端口的ip；
            System.out.println(addr.getHostAddress());//返回ip；
            System.out.println(addr.getHostName());//输出端口名；

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }


}
