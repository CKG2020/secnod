package com.example.javaanli.demo.controller1;


import com.example.javaanli.demo.service1.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
    @Autowired
    private NewsServiceImpl  newsService;




    @RequestMapping("/QuerryNews")
    public   String qingjiarequest(){


        return "qingjiarequest";

    }


}

