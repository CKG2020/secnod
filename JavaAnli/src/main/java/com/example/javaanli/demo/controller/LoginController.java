package com.example.javaanli.demo.controller;

import com.example.javaanli.demo.Model.Student;
import com.example.javaanli.demo.Model.Teacher;
import com.example.javaanli.demo.service.StuServiceImpl;

import com.example.javaanli.demo.service.TeaServiceImpl;
import javafx.beans.binding.ObjectBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Action;

@Controller
@RequestMapping("/")

public class LoginController {
    @Autowired
    private StuServiceImpl stuService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    private TeaServiceImpl teaService;

    @Autowired
    private HttpSession session;
    //
//    @RequestMapping("welcome")
//    public  String success(){
//        return  "welcome";
//
//    }
    @RequestMapping(value = "student_login", method = RequestMethod.POST)
    @ResponseBody
    public String student_login(@RequestParam String Sno, String Spwd) {
//        Student student;
        System.out.println(Sno);

        //将数据存储到session中
        session.setAttribute("sno", Sno);
//        session.setAttribute();

        Student student = stuService.findByNumAndPassword(Sno, Spwd);
        if (null != student && !"".equals(student)) {

            return "1";
        }

        return "0";

    }//用户登录


    @RequestMapping(value = "tea", method = RequestMethod.POST)
    @ResponseBody
    public String tea(@RequestParam String Sno, String Spwd) {
        System.out.println("xxxx");
        Object obj = teaService.findByNumAndPassword(Sno, Spwd);

        if (obj != null) {
            return "ok";
        } else {
            return "此教师不存在";
        }

    }


    @RequestMapping("Stu/isused")
    @ResponseBody
    public String used(@RequestParam String Sno) {
        System.out.println(Sno);
        Object obj = stuService.findStuBySno(Sno);
        if (obj != null) {
            return "此用户已存在!";
        } else {
            return "ok";
        }

    }


    @RequestMapping(value = "addUser")
    @ResponseBody
    public String submit(@RequestParam String Sno, String Spwd, String Name, String Class) {
//        System.out.println(Sno);
//        System.out.println(Spwd);
//        System.out.println(Name);
//        System.out.println(Class);
        System.out.println("yyyuyu");
        int a = stuService.addUser(Sno, Spwd, Name, Class);
        if (0 != a) {
            Student student = stuService.findStuBySno(Sno);
            System.out.println(Sno);
            HttpSession session = request.getSession();

            session.setAttribute("student", student);
            System.out.println("student" + student);

            return "true";
        } else {
            return "添加用户失败";
        }
    }




    @RequestMapping("welcome")

    public String welcome() {

            return "welcome";
        }


    @RequestMapping("student")

    public String student() {

        return "student";
    }



    @RequestMapping("teacher")

    public String teacher() {

        return "teacher";
    }



    }


