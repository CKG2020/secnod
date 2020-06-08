package com.example.javaanli.demo.controller;

import com.example.javaanli.demo.Model.Record;
import com.example.javaanli.demo.service.RecordServiceImpl;
//import com.example.javaanli.demo.service.StuServiceImpl;
//import com.rabbitmq.tools.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
   
    RecordServiceImpl recordService;


//    @RequestMapping("findallcount")
//    @ResponseBody
//    public int findallcount(){
//        recordService.findAll();
//        return recordService.findallcount();
//    }
//
//    @RequestMapping("findpage")
//    @ResponseBody
//    public List<Record> findpage(@RequestParam String curr, String pageSize){
//        return recordService.findpage(Integer.valueOf(curr),Integer.valueOf(pageSize));
//    }
//



    @RequestMapping("/findbySno")
    @ResponseBody
    public List<Record> findbySno(@RequestParam String Sno){
        return recordService.findBySno(Sno);
    }



    @RequestMapping("/findbyClass")
    @ResponseBody
    public List<Record> findbyClass(@RequestParam String Sclass){
        return recordService.findByClass(Sclass);
    }

    @RequestMapping("/findbyName")
    @ResponseBody
    public List<Record> findbyName(@RequestParam String Sname){
        return recordService.findBySname(Sname);
    }



//    @RequestMapping("findNameCount")
//    @ResponseBody
//    public int findNameCount(@RequestParam String Sname){
//        return recordService.findNameCount(Sname);
//    }
//
//
//    @RequestMapping("findClassCount")
//    @ResponseBody
//    public int findClassCount(@RequestParam String Sclass){
//        return recordService.findClassCount(Sclass);
//    }
//
//    @RequestMapping("findSnoCount")
//    @ResponseBody
//    public int findSnoCount(@RequestParam String Sno){
//        return recordService.findSnoCount(Sno);
//    }

//    @RequestMapping("delete")
//    @ResponseBody
//    public String delete(@RequestParam String Sno){
//        if(recordService.delUser(Sno))
//            return "ok";
//        else{
//            return "wrong!";
//        }
//    }
//    @RequestMapping("deleteuser")
//    public String deleteuser(){
//        return "admin/demodel";
//    }
//    @RequestMapping("analyzing")
//    public String analyzing(){
//        return "admin/analyzing";
//    }
//    @RequestMapping("listener")
//    public String listener(){
//        return "admin/listener";
//    }
//    @RequestMapping("addQuestion")
//    public String addQuestion(){
//        return "admin/addQuestion";
//    }

//    @RequestMapping(value="finishedPercent")
//    @ResponseBody
//    public AnalyzingData finishedPercent(){
//        System.out.println(recordService.analyzingRes());
//        return recordService.analyzingRes();
//
//    }





}

