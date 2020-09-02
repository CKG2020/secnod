package com.example.javaanli.demo.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检查
 * 拦截器
 */
//@Component
//public class LoginHandlerInterceptor implements HandlerInterceptor {
//    //目标方法执行之前
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object loginUser = request.getSession().getAttribute("sno");
//        if (loginUser==null){
//            //未登录,返回登录界面
////            request.setAttribute("msg","没有权限,请先登录");
//            request.getRequestDispatcher("/welcome.html").forward(request,response);
//            return false;
//        }else{
//            //已经登录
//            return true;
//        }
//
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
