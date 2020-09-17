package com.example.demo.cache9_14.controller;

import com.example.demo.cache9_14.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam(name = "a") String num1, @RequestParam(name = "b") String num2) {
        return "cccdddd" + num1 + num2;
    }


    @RequestMapping(value = "/hello2/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public String hello2(@PathVariable(name = "a") int num1, @PathVariable(name = "b") int num2) {
        return "cccdddd" + num1 + num2;
    }

//还没有搞定
    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    @ResponseBody
    public String hello3(@RequestBody User user) {
        return user.getName();
    }





    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloPage() {
        return "index";
    }


    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    @ResponseBody
    public String  userInfo() {
        User user = new User();
        user.setAge(11);
        user.setName("abc");
        user.setId(1);
        user.setPassword("123456");
        return user.toString();
    }
}
