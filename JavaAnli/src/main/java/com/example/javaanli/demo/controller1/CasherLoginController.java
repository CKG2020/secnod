package com.example.javaanli.demo.controller1;

//import javax.servlet.http.HttpSession;
import com.example.javaanli.demo.entity1.Casher;
import com.example.javaanli.demo.service1.CasherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CasherLoginController {

   @Autowired
   private CasherServiceImpl casherService;



    @RequestMapping(value = "casher_login", method = RequestMethod.GET)
    public String login(){

        return "casherlogin";
    }

    @RequestMapping(value = "casher_check", method = RequestMethod.POST)

    public String casher_login(@RequestParam String name1,@RequestParam String password1) {

        if(name1==null)
            return "casher_login";
        Casher casher = casherService.findUserByNameAndPassword(name1, password1);
        if(casher!=null)
        {
            return "bindexcash";
        }else
            return "fail";

    }


}
