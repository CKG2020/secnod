package boot.spring.schedule;

import boot.spring.po.News;
import boot.spring.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
//定时器
@Component
public class ScheduledTasks {

	@Autowired
	private NewsServiceImpl newsService;

//	在子表达式（分钟）里的“0/15”表示从第0分钟开始，每1分钟
	@Scheduled(cron="0 0/1 * * * ?")
	public void reportCurrentTime() {
		List<News> newsPage = newsService.getNewsPage(1, 10);
		System.out.println(newsPage.get(0).getSubject());
//	        List<Actor> list=actorservice.getpageActors(1, 10);
//	        System.out.println(list.get(0).getFirst_name());
	}
}
