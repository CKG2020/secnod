package com.example.javaanli.demo.config;



//import com.example.javaanli.demo.component.LoginHandlerInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class MyConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("com").setViewName("indexPage");
//    }
//
//    @Bean
//    public WebMvcConfigurer webMvcConfigurerAdapter(){
//        WebMvcConfigurer adapter=new WebMvcConfigurer() {
//
//
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
////                registry.addViewController("/").setViewName("login");
////                registry.addViewController("/index.html").setViewName("login");
////                registry.addViewController("/main.html").setViewName("/Stu/Querry_Request.html");
//            }
//            //注册拦截器
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/student.html","/welcome.html","/teacher.html");
//
////                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/welcome.html","/","");
////                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/Tea/student.html","/","/student_login");
//            }
//        };
//
//
//
//
//        return adapter;
//    }
////    @Bean
////    public LocaleResolver localeResolver(){
////        return new MyLocaleResolver();
////    }
//}
