package test3;


import test3.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Manager {
    private User user;//注入User对象
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
//    protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
//                                                 HttpServletResponse arg1) throws Exception {
//        user.printInfo();//执行User中的信息打印方法
//        return null;
//    }
}