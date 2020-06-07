package com.example.javaanli.demo.controller;


import com.example.javaanli.demo.Model.Student;
import com.example.javaanli.demo.mapper.RecordMapper;
import com.example.javaanli.demo.service.RecordServiceImpl;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Record")
public class RecordController {

    @Autowired
    private RecordServiceImpl recordService;


    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    @ResponseBody
//    String class_tea_status = "0";

    public String addRecord(@RequestParam String stu_number, String stu_class, String stu_name, String qingjia_time,
                            String start_time, String end_time, String qingjia_reason) {

        int a = (int) recordService.addRecord(stu_number, stu_class, stu_name, qingjia_time, start_time, end_time,qingjia_reason);
        if (0 != a) {

            return "ok";
        }
       else{
           return "fail";

        }

    }
}

