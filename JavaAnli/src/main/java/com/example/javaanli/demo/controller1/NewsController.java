package com.example.javaanli.demo.controller1;


import com.example.javaanli.demo.entity1.News;
import com.example.javaanli.demo.pagemodel.NewsGrid;
import com.example.javaanli.demo.service1.NewsServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsServiceImpl  newsService;




    @RequestMapping("/shownews")
//    @RequestMapping(value="/actors",method = RequestMethod.GET)
    @ResponseBody
    public NewsGrid getactorlist(@RequestParam(value="current") int current, @RequestParam(value="rowCount") int rowCount){
        int total=newsService.getNewsNum();
        List<News> allNews = newsService.findAllNews();
        NewsGrid newsGrid = new NewsGrid();
        newsGrid.setCurrent(current);
        newsGrid.setRowCount(rowCount);
        newsGrid.setRows(allNews);
        newsGrid.setTotal(total);
        System.out.println("xxxxxxxxxxxxxx");
        return newsGrid;
    }


    @RequestMapping(value="/bseenews",method = RequestMethod.GET)
    public String showactor(){
        System.out.println("zzzzzzzzzzzzzzz");
        return "bseenews";
    }







    @RequestMapping("findpage")
    @ResponseBody
    public List<News> findpage(@RequestParam String curr, String pageSize){
        System.out.println("ssssssssssssssss");

        System.out.println(curr);
        System.out.println("xxxxxxxxxxxxxxxxx");
        System.out.println(pageSize);

        List<News> userList =newsService.findAllNews();
        System.out.println("分页数据："+userList);
        //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>



        PageInfo<News> pageInfo = new PageInfo<>(userList,Integer.valueOf(pageSize));
        System.out.println("==================");
        System.out.println(pageInfo.toString());

        return  pageInfo.getList();
    }



//    @RequestMapping("findpage")
//    @ResponseBody
//    public List<Record> findpage1(@RequestParam String curr, String pageSize){
//        System.out.println("ssssssssssssssss");
//
//        System.out.println(curr);
//        System.out.println(pageSize);
//        List<Record> userList =recordService.findAll();
//        System.out.println("分页数据："+userList);
//        PageInfo<Record> pageInfo = new PageInfo<>(userList,Integer.valueOf(pageSize));
//        System.out.println("==================");
//        System.out.println(pageInfo.toString());
//        return  pageInfo.getList();
//    }














//
//
//
//    @RequestMapping("/showNews")
//    public String userList(Model model,
//                           @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
//                           @RequestParam(defaultValue="2",value="pageSize")Integer pageSize){
//        //为了程序的严谨性，判断非空：
//        //设置默认当前页
//        if(pageNum==null || pageNum<=0){
//            pageNum = 1;
//        }
//        //设置默认每页显示的数据数
//        if(pageSize == null){
//            pageSize = 1;
//        }
//        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
//
//        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
//        PageHelper.startPage(pageNum,pageSize);
//        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
//        try {
//            List<News> userList = newsService.findAllNews();
//            System.out.println("分页数据："+userList);
//            //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
//            PageInfo<News> pageInfo = new PageInfo<News>(userList,pageSize);
//            //4.使用model传参数回前端
//            model.addAttribute("pageInfo",pageInfo);
//            model.addAttribute("userList",userList);
//        }finally {
//            //清理 ThreadLocal 存储的分页参数,保证线程安全
//            PageHelper.clearPage();
//        }
//        return "bseenews";
//    }
//
//
//    /**
//     *
//     * @param model 携带数据返回
//     * @param pageSize 一页显示多少条-非必传值
//     * @param pageNum 显示当前页--必传值
//     * @return 前端页面
//     * @Author: Zoutao
//     * @Date: 2018/12/6
//     */
////分页查询数据
//    @GetMapping("/usermanage")
//    public String usermanage(Model model,
//                             @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
//                             @RequestParam(defaultValue="5",value="pageSize")Integer pageSize){
//
//        //为了程序的严谨性，判断非空：
//        if(pageNum == null){
//            pageNum = 1;   //设置默认当前页
//        }
//        if(pageNum <= 0){
//            pageNum = 1;
//        }
//        if(pageSize == null){
//            pageSize = 5;    //设置默认每页显示的数据数
//        }
//        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
//
//        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
//        PageHelper.startPage(pageNum,pageSize);
//        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
//        try {
//            List<News> userList = newsService.findAllNews();
//            System.out.println("分页数据："+userList);
//            //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
//            PageInfo<News> pageInfo = new PageInfo<News>(userList,pageSize);
//            //4.使用model/map/modelandview等带回前端
//            model.addAttribute("pageInfo",pageInfo);
//        }finally {
//            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
//        }
//        //5.设置返回的jsp/html等前端页面
//        // thymeleaf默认就会拼串classpath:/templates/xxxx.html
//        return "bseenews";
//    }



}

