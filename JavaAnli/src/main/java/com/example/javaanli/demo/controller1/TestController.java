package com.example.javaanli.demo.controller1;


import com.example.javaanli.demo.annotation.Syslog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/sys")
public class TestController {

    @Syslog("测试注解")
    @GetMapping("/testAnnotation")
    public String testAnnotation(String name){
        return "你好" + name;
    }
}
