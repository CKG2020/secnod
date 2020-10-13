//package com.example.javaanli.demo.service1;
//
//
//import com.example.javaanli.demo.dao1.mapper.NewsMapper;
//import com.example.javaanli.demo.entity1.News;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class NewsServiceImpl {
//
//    @Autowired
//    private NewsMapper newsMapper;
//
//
//    public List<News>  findAllNews(){
//     return  newsMapper.findAllNews();
//
//    }
//    public List<News> getNewsPage(int pagenum, int pagesize) {
//        PageHelper.startPage(pagenum,pagesize);
//        List<News> l=findAllNews();
//        return l;
//    }
//
//  public   int getNewsNum(){
//        List<News> allNews = findAllNews();
//        return allNews.size();
//    }
//
//}
