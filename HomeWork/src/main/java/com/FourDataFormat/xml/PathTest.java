package com.FourDataFormat.xml;

import java.io.InputStream;

public class PathTest {
    public static void main(String[] args) {
        PathTest pathTest = new PathTest();
//        InputStream is = pathTest.getClass().getResourceAsStream("admin.xml");  //拿不到资源
//        InputStream is = pathTest.getClass().getResourceAsStream("/" +"admin.xml"); // 拿到资源
        InputStream is = pathTest.getClass().getClassLoader().getResourceAsStream("admin.xml"); //拿到资源
        System.out.println(is);
//              /home/ckg/secnod/secnod/HomeWork/src/main/resources/admin.xml
//    }
    }
}