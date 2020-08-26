//package com.example.javaanli.demo.controller;
//
//
//import com.example.javaanli.demo.Model.Record;
//import com.example.javaanli.demo.service.RecordServiceImpl;
//import com.github.pagehelper.PageInfo;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
//@Controller
//@RequestMapping("/Record")
//public class RecordController {
//
//    @Autowired
//    private RecordServiceImpl recordService;
//
//    @Autowired
//    private HttpSession session;
//
//    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
//    @ResponseBody
////    String class_tea_status = "0";
//
//    public String addRecord(@RequestParam String stu_number, String stu_class, String stu_name, String qingjia_time,
//                            String start_time, String end_time, String qingjia_reason) {
//        System.out.println("xxxxx");
//
//        int a = (int) recordService.addRecord(stu_number, stu_class, stu_name, qingjia_time, start_time, end_time,qingjia_reason);
//        if (0 != a) {
//
//            return "ok";
//        }
//       else{
//           return "fail";
//
//        }
//
//    }
//
//
//
//
//    @RequestMapping(value = "/QuerryStatus" , method = RequestMethod.POST)
//    @ResponseBody
//    public String QuerryStatus(){
//   String stu_number=session.getAttribute("sno").toString();
//        System.out.println("--------------------");
//        System.out.println(stu_number);
//        System.out.println("--------------------");
//        System.out.println("cccccccccccccccccccccc");
//        String  querrystatus = recordService.querrystatus(stu_number);
//
//
//        System.out.println(querrystatus);
//
//
//        if (querrystatus=="null"){
//            return "wu";
//        }
//        else if (querrystatus=="-1"){
//            return "bu";
//        }else {
//
//            return "hao";
//        }
//
//
//
//
//    }
//
//
//
//    @RequestMapping("showrecord")
//    public   String register1(){
//        return "demo";
//
//    }
//
//    @RequestMapping("showrecords")
//    @ResponseBody
//    public   String register2(){
//        return "demo";
//
//    }
//
//
////
////    @RequestMapping("/showrecord")
////    public String userList(Model model,
////                           @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
////                           @RequestParam(defaultValue="2",value="pageSize")Integer pageSize){
////        //为了程序的严谨性，判断非空：
////        //设置默认当前页
////        if(pageNum==null || pageNum<=0){
////            pageNum = 1;
////        }
////        //设置默认每页显示的数据数
////        if(pageSize == null){
////            pageSize = 1;
////        }
////        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
////
////        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
////        PageHelper.startPage(pageNum,pageSize);
////        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
////        try {
////            List<Record> userList = recordService.findAll();
////            System.out.println("分页数据："+userList);
////            //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
////            PageInfo<Record> pageInfo = new PageInfo<Record>(userList,pageSize);
////            //4.使用model传参数回前端
////            model.addAttribute("pageInfo",pageInfo);
////            model.addAttribute("userList",userList);
////        }finally {
////            //清理 ThreadLocal 存储的分页参数,保证线程安全
////            PageHelper.clearPage();
////        }
////        return "showrecord";
////    }
//
//
////    /**
////     *
////     * @param model 携带数据返回
////     * @param pageSize 一页显示多少条-非必传值
////     * @param pageNum 显示当前页--必传值
////     * @return 前端页面
////     * @Author: Zoutao
////     * @Date: 2018/12/6
////     */
//////分页查询数据
////    @GetMapping("/usermanage")
////    public String usermanage(Model model,
////                             @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
////                             @RequestParam(defaultValue="5",value="pageSize")Integer pageSize){
////
////        //为了程序的严谨性，判断非空：
////        if(pageNum == null){
////            pageNum = 1;   //设置默认当前页
////        }
////        if(pageNum <= 0){
////            pageNum = 1;
////        }
////        if(pageSize == null){
////            pageSize = 5;    //设置默认每页显示的数据数
////        }
////        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
////
////        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
////        PageHelper.startPage(pageNum,pageSize);
////        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
////        try {
////            List<Record> userList = recordService.findAll();
////            System.out.println("分页数据："+userList);
////            //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
////            PageInfo<Record> pageInfo = new PageInfo<Record>(userList,pageSize);
////            //4.使用model/map/modelandview等带回前端
////            model.addAttribute("pageInfo",pageInfo);
////        }finally {
////            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
////        }
////        //5.设置返回的jsp/html等前端页面
////        // thymeleaf默认就会拼串classpath:/templates/xxxx.html
////        return "showrecord";
////    }
//
//
//
//    @RequestMapping("/toEdit")
//    public String toEdit(Model model,String stu_number) {
//      Record  record=recordService.findBySno(stu_number);
//        model.addAttribute("record", record);
//
//        return "user/userEdit";
//    }
//
//
//
//    @RequestMapping(value="/deleteRecord",method=RequestMethod.POST)
//    @ResponseBody
//    public   String deleteRecord(){
//        String stu_number=session.getAttribute("sno").toString();
//        Record bySno = recordService.findBySno(stu_number);
//        System.out.println("----------------");
//        System.out.println(bySno);
//        if (bySno!=null){
//            int s = recordService.deleteRecord(stu_number);
//            System.out.println("xxxxxxxxxxxxxxxx");
//            System.out.println(s);
//            return "true";
//        }
//
//        return "false";
//
//    }
//
//
//    @RequestMapping("findallcount")
//    @ResponseBody
//    public int findallcount(){
//        List<Record> all = recordService.findAll();
//        System.out.println("-------------------");
//        System.out.println(all.size());
//        return all.size();
//    }
//
//
//    @RequestMapping("findpage")
//    @ResponseBody
//    public List<Record> findpage(@RequestParam String curr, String pageSize){
//        System.out.println("ssssssssssssssss");
//
//        System.out.println(curr);
//        System.out.println("xxxxxxxxxxxxxxxxx");
//        System.out.println(pageSize);
//
//        List<Record> userList =recordService.findAll();
//        System.out.println("分页数据："+userList);
//        //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
//
//
//
//        PageInfo<Record> pageInfo = new PageInfo<>(userList,Integer.valueOf(pageSize));
//        System.out.println("==================");
//        System.out.println(pageInfo.toString());
//
//        return  pageInfo.getList();
//    }
//
//
//
//    @RequestMapping("/teacherRequest")
//    public String teacherRequest() {
//
//        return "teacherRequest";
//    }
//
//
//
//    @RequestMapping("/pijia")
//    public String teacherRequest1() {
//
//        return "pijia";
//    }
//
//    @RequestMapping("/pijias")
//    @ResponseBody
//    public String teacherRequest2() {
//
//        return "pijia";
//    }
//
//
//    @RequestMapping(value = "/tongyi",method = RequestMethod.POST)
//    @ResponseBody
//    public String tongyi(@RequestParam String Sno) {
//
//        System.out.println(recordService.tongyi(Sno));
//
//        int a = recordService.tongyi(Sno);
//        if (a!=0){
//            return "1";
//
//        }
//
//
//        return "0";
//    }
//
//
//
//    @RequestMapping(value = "/fandui",method = RequestMethod.POST)
//    @ResponseBody
//    public  String  fandui (@RequestParam String Sno) {
//
//        int a = recordService.fangdui(Sno);
//        if (a!=0){
//            return "1";
//
//        }
//
//        return "0";
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
//
