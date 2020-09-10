package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    //问题如何在不是单侧环境下使用spring注入的内容
    //啥样的项目可以被spring托管
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
