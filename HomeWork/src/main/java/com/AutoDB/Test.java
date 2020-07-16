package com.AutoDB;

public class Test {
    public static void main(String[] args) {
        MapperProxy mapperProxy = new MapperProxy();

        UserMapper userMapper = mapperProxy.newInstance(UserMapper.class);
        User user = userMapper.getUserById(5522);
        System.out.println(user.getName());
        System.out.println(user.getAge());


    }
}
