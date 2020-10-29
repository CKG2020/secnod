package com.example.javaanli.demo.controller1;

//import javax.servlet.http.HttpSession;
import com.example.javaanli.demo.annotation.LogRecord;
import com.example.javaanli.demo.entity1.Casher;
import com.example.javaanli.demo.service1.CasherServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
@Api(tags = "收银员登录模块")
@Controller
public class CasherLoginController {

   @Autowired
   private CasherServiceImpl casherService;


    @ApiOperation(value = "登录平台", notes = "通过用户名密码登录")
    @RequestMapping(value = "casher_login", method = RequestMethod.GET)
    @LogRecord(operation = "收银员登录", type = "测试")
    public String login(){

        return "casherlogin";
    }
    @ApiOperation(value = "验证用户填写的信息", notes = "与数据库的用户名密码核对")
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
