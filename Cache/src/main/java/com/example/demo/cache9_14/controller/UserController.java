package com.example.demo.cache9_14.controller;



import com.example.demo.cache9_14.entity.User;
import com.example.demo.cache9_14.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String username, String password) {
        User user = userService.findUserByNameAndPassword(username, DigestUtils.md5DigestAsHex(password.getBytes()));
        if (user == null || user.getName() == null) {
            return "用户不存在或用户名、密码错误";
        }
        return "hello" + user.getName();
    }

    @RequestMapping(value = "registry", method = RequestMethod.POST)
    @ResponseBody
    public String registry(@RequestBody User user) {
        boolean register = userService.register(user);
        if (register) {
            return "hello" + user.getName();
        }
        return "注册失败";
    }


    @RequestMapping(value = "find_name", method = RequestMethod.GET)
    @ResponseBody
    public String registry(@RequestParam String username) {
        User userByName = userService.findUserByName(username);
        if (userByName != null) {
            return userByName.getName();
        }
        return "未找到该用户";
    }


    @RequestMapping(value = "find_id", method = RequestMethod.GET)
    @ResponseBody
    public String findById(@RequestParam int id) {
        User userById = userService.findById(id);
        if (userById != null) {
            return userById.getName();
        }
        return "未找到该用户";
    }

//    @RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml 格式或者 json等】封装为对应的 JavaBean 对象，
//    封装时使用到的一个对象是系统默认配置的 HttpMessageConverter进行解析，然后封装到形参上。


//    @ResponseBody是作用在方法上的，@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，
//    一般在异步获取数据时使用【也就是AJAX】，在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上
//    @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。


    @RequestMapping(value = "update_name", method = RequestMethod.POST)
    @ResponseBody
    public String updateName(@RequestBody User user) {
        int count = userService.updateUserName(user);
        if (count != 0) {
            return "更新成功";
        }
        return "未找到该用户";
    }


}
