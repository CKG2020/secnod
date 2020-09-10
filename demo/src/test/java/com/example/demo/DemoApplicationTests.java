package com.example.demo;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    HelloService helloService;

    @Test
    void contextLoads() {
        String ckg = helloService.sayHello("ckg");
        //assertThat判断单侧的结果是否是我们预期的结果  不必每次都在需要测试的地方加入sout语句 影响代码的整洁性
       assertThat(ckg, Matchers.is("Hellockg!"));
    }

}
