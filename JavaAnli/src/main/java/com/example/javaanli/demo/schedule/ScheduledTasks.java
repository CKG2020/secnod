//package com.example.javaanli.demo.schedule;
//
//import com.example.javaanli.demo.entity1.News;
//import com.example.javaanli.demo.service1.NewsServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class ScheduledTasks {
//
//	@Autowired
//	private NewsServiceImpl newsService;
//
//	    @Scheduled(cron="0 0/1 * * * ?")
//	    public void reportCurrentTime() {
//			List<News> newsPage = newsService.getNewsPage(1, 2);
//			System.out.println(newsPage.get(0).getSubject());
////	        List<Actor> list=actorservice.getpageActors(1, 10);
////	        System.out.println(list.get(0).getFirst_name());
//	    }
//}
