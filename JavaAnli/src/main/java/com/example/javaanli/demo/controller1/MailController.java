package com.example.javaanli.demo.controller1;

import com.example.javaanli.demo.service1.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ejb.Schedule;

@Controller
public class MailController {
    @Autowired
    MailService mailService;

     @RequestMapping("/test1")
     @Scheduled(cron="0 * * * *?")  //每一分钟执行一次
    public void sendSimpleMail() {
        mailService.sendSimpleMail("2488397825@qq.com",
                "2451418337@qq.com",
                "1689253762@qq.com",
                "测试邮件主题",
                "测试邮件内容");
    }
}
