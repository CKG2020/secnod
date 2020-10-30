package com.FourDataFormat.json;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class TestJson {
    public static void main(String[] args) {
        Person ckg = new Person(20, "ckg");
        String string = JSON.toJSONString(ckg);
        System.out.println(string);
//        {"age":20,"fullname":"ckg"}
        String json="{'age':20,'fullname':'ckg'}";
        Person person = JSON.parseObject(string, Person.class);
        System.out.println(person.getFullname());

        String jsonStr2 = "[{'age':'123123','fullname':'zhangsan'},{'age':'321321','fullname':'lisi'}]";
        List<Person> users = JSON.parseArray(jsonStr2, Person.class);
        System.out.println("json字符串转List<Object>对象:"+users.toString());


        String jsonStr3 = "{'name':'userGroup','persons':[{'age':'123123','fullname':'zhangsan'},{'age':'321321','fullname':'lisi'}]}";
        PersonGroup userGroup = JSON.parseObject(jsonStr3, PersonGroup.class);
        System.out.println("json字符串转复杂java对象:"+userGroup);






    }
}
