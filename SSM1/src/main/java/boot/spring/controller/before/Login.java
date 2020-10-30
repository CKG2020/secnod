package boot.spring.controller.before;

import boot.spring.po.Casher;
import boot.spring.service.CasherServiceImpl;
import boot.spring.service.before.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class Login {
//	@Autowired
//	LoginService loginservice;

	@Autowired
	CasherServiceImpl casherService;
	@RequestMapping(value="/loginvalidate",method=RequestMethod.POST)
	public String loginvalidate(@RequestParam("username") String username,@RequestParam("password") String pwd,HttpSession httpSession){
		if(username==null)
			return "login";
//		String realpwd=loginservice.getpwdbyname(username);

		Casher userByNameAndPassword = casherService.findUserByNameAndPassword(username, pwd);

		if(userByNameAndPassword!=null)
		{
			httpSession.setAttribute("username", username);
			System.out.println("11111111111111111111111");
			return "showactor";
		}else
			return "fail";
	}


	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("username");
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.GET)
	String login(){
		return "login";
	}
  }
