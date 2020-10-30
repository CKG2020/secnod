package boot.spring.controller.before;

import boot.spring.pagemodel.NewsGrid;
import boot.spring.po.News;
import boot.spring.po.before.Actor;
import boot.spring.service.NewsServiceImpl;
import boot.spring.service.before.ActorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

//swagger是当前最好用的Restful  API文档
// 生成的开源项目,通过swagger-spring项目实现了springMVC框架的无缝集成功能,
// 方便生成restful风格的接口文档,
//value - 字段说明  description - 注释说明这个类
@Api(tags = "消息接口")
@Controller
public class ActorController {
//	@Autowired
//	private ActorService actorservice;


	@Autowired
    private NewsServiceImpl newsService;

	private static final Logger LOG = LoggerFactory.getLogger(ActorController.class);

	@ApiOperation("获取所有消息列表")
	@RequestMapping(value="/actors",method = RequestMethod.GET)
	@ResponseBody
	public NewsGrid getNewslist(@RequestParam(value="current") int current,@RequestParam(value="rowCount") int rowCount){
//		int total=actorservice.getactornum();
//		List<Actor> list=actorservice.getpageActors(current,rowCount);
//		ActorGrid grid=new ActorGrid();


        int newsNum = newsService.getNewsNum();
        List<News> allNews = newsService.findAllNews();
        NewsGrid newsGrid = new NewsGrid();
        newsGrid.setCurrent(current);
        newsGrid.setRowCount(rowCount);
        newsGrid.setRows(allNews);
        newsGrid.setTotal(newsNum);


//
//        grid.setCurrent(current);
//		grid.setRowCount(rowCount);
//		grid.setRows(list);
//		grid.setTotal(total);
		System.out.println("333333333333333333");
		LOG.debug("获取所有消息列表");
		return newsGrid;
	}

//- @ApiOperation()用于方法；
//	表示一个http请求的操作
	@ApiOperation("修改一个消息")
	@RequestMapping(value="/actors",method = RequestMethod.PUT)
	@ResponseBody
	public int updateactor(@RequestBody News a){
//		Actor actor=actorservice.updateactor(a);
		LOG.debug("修改一个消息");
        int i = newsService.updateNews(a.getSubject(), a.getName(), a.getTime(), a.getMessage());
        return i;
	}


//	@ApiOperation("获取一个消息")
//	@RequestMapping(value="/actors/{id}",method = RequestMethod.GET)
//	@ResponseBody
//	public News getactorbyid(@PathVariable("id") short id){
////		Actor a=actorservice.getActorByid(id);
//		News oneNews = newsService.findOneNews(id);
//		LOG.debug("获取一个消息");
//		return oneNews;
//	}

	@ApiOperation("添加一个消息")
	@RequestMapping(value="/actors",method = RequestMethod.POST)
	@ResponseBody
	public int  add(@RequestBody   News a){
        int i = newsService.addNews(a.getSubject(),a.getName(),a.getTime(),a.getMessage());
//        Actor actor=actorservice.addactor(a);
//		LOG.debug("添加一个消息");
//		return actor;
        LOG.debug("添加一个消息");
        return i;
	}
//
	@ApiOperation("删除一个消息")
	@RequestMapping(value="/actors/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable("id") int  id){

		newsService.deleteNews(id);
//		actorservice.delete(Short.valueOf(id));
		LOG.debug("删除一个消息");
		return "success";
	}

//	@ApiOperation("把演员导出为Excel")
//	@RequestMapping(value="/exportactor",method = RequestMethod.GET)
//	public void export(HttpServletResponse response) throws Exception{
//		InputStream is=actorservice.getInputStream();
//		response.setContentType("application/vnd.ms-excel");
//		response.setHeader("contentDisposition", "attachment;filename=AllUsers.xls");
//		ServletOutputStream output = response.getOutputStream();
//		IOUtils.copy(is, output);
//	}

//	@RequestMapping(value="/showactor",method = RequestMethod.GET)
//	public String showactor(){
//		System.out.println("zzzzzzzzzzzzzzz");
//		return "showactor";
//	}
}
