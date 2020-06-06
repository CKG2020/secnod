package com.example.javaanli.demo.controller;
import com.example.javaanli.demo.Model.Student;
import com.example.javaanli.demo.service.StuServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
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

//
//    @RequestMapping("welcome")
//    public  String success(){
//        return  "welcome";
//
//    }
    @RequestMapping(value = "student_login" ,method = RequestMethod.POST)
    @ResponseBody
    public Object student_login(@RequestParam String Sno, String Spwd){
        Student student;


        Object obj = stuService.findByNumAndPassword(Sno,Spwd);
        if (obj.equals(1)||obj.equals(0)){
            return obj.toString();
        }
        HttpSession session = request.getSession();
        student=(Student)obj;
        session.setAttribute("student",student);
        return student;
    }//用户登录


    @RequestMapping("isused")
    @ResponseBody
    public String used(@RequestParam String Sno){
        System.out.println(Sno);
        Object obj = stuService.findStuBySno(Sno);
        if(obj!=null){
            return "此用户已存在!";
        }
        else{
            return "ok";
        }

    }

    @RequestMapping(value = "addUser" )
    @ResponseBody
    public String submit(@RequestParam String Sno, String Spwd,String Class,String Name) {
        int a = stuService.addUser(Sno, Spwd, Class, Name);
        if (0 != a) {
            Student student = stuService.findStuBySno(Sno);
            System.out.println(Sno);
            HttpSession session = request.getSession();

            session.setAttribute("student", student);
            System.out.println("student" + student);

            return "Stu/RegisterSuccess";
        }

        else{
            return  "添加用户失败";
        }
    }
}
