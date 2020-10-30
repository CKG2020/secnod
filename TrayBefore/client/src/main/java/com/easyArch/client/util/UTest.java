package com.easyArch.client.util;

public class UTest
//        {
//        public static void mainString[] args) {
//                duString txt = "你好";
//                 
//                for(int i=0; i<txt.length(); i++) {
//                    System.out.println("\\u" + Integer.toHexString(txt.charAt(i)).toUpperCase());
//                }
//            }
//        }
{

    public static void main(String[] args) {

        String  txt="密码";
        System.out.println(txt.length());
        for (int i = 0; i <txt.length(); i++) {
            System.out.println("=============");
            System.out.println("\\u"+Integer.toHexString(txt.charAt(i)).toUpperCase());

        }

    }



}