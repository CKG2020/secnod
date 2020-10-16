package com.example.javaanli.demo.controller1;

import com.example.javaanli.demo.annotation.LogRecord;
import com.example.javaanli.demo.dao1.mapper.MemberMapper;
import com.example.javaanli.demo.entity1.Member;
import com.example.javaanli.demo.service1.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    @Autowired
    private MemberServiceImpl memberService;

    @RequestMapping(value = "/addmember", method = RequestMethod.POST)
    @ResponseBody
    @LogRecord(operation = "添加会员", type = "收银员操作")
    public String addRecord(@RequestParam String mname, String phone, String email, String adress
                            ) {
        System.out.println("xxxxx");
        int i = memberService.addMember(mname, phone, email, adress);
        if (0!=i){
            return "ok";
        }
        else {
            return "fail";
        }

    }




    @RequestMapping(value = "/bquerry", method = RequestMethod.POST)
    public String bquerry(@RequestParam int id
    ) {
        System.out.println("xxxxx");
        Member byId = memberService.findById(id);
        if (null!=byId){
            return "bmember1";
        }
        else {
            return "fail";
        }

    }


//    @RequestMapping("/ok")
//    public   String register1(){
//        return "";
//
//    }



}
