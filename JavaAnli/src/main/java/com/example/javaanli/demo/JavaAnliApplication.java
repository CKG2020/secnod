package com.example.javaanli.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.javaanli.demo.dao1.mapper")
public class JavaAnliApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaAnliApplication.class, args);

    }
}

