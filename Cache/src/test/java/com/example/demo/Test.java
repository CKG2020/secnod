package com.example.demo;

import cn.hutool.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


//        JSONObject json = new JSONObject();//new一个json对象
//        Map<String, Object> map = new HashMap<String, Object>();//new一个map集合
//        map.put("phone", "13890909023");
//        map.put("username", "124526376");
//        map.put("password", "123");
//        map.put("id", "1000908900");
//        json.put("params", map);//将数据放入json中   注：若将此json数据放入url地址栏中会，程序运行时会报错，所以需进行操做
//
//        String tojsonstring =  json.toJSONString();//将json格式的数据转换为字符格式
//        try {
//            tojsonstring = URLEncoder.encode(tojsonstring, "utf-8");//将数据进行编码
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        System.out.println("java代码封装为json字符串");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "xxx");
        jsonObject.put("age", 24);
        jsonObject.put("name", "男");
        jsonObject.put("password","123");

        System.out.println("java--->json \n " + jsonObject.toString());


    }
}
