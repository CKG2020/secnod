package boot.spring.service;


import boot.spring.mapper.NewsMapper;
import boot.spring.po.News;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl {

    @Autowired
    private NewsMapper newsMapper;


    public List<News>  findAllNews(){
     return  newsMapper.findAllNews();

    }
    public List<News> getNewsPage(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<News> l=findAllNews();
        return l;
    }

  public   int getNewsNum(){
        List<News> allNews = findAllNews();
        return allNews.size();
    }

    public int addNews(String subject,String name,String time,String message){
        return  newsMapper.addNews(subject,name,time,message);
    }


    public  int updateNews(String subject,String name,String time,String message){
        return  newsMapper.updateNews(subject, name, time, message);
    }

    public void deleteNews(int id){
         newsMapper.deleteNews(id);
    }

 public  News findOneNews(int id){
     News oneNews = newsMapper.findOneNews(id);
     return oneNews;
 }




}
