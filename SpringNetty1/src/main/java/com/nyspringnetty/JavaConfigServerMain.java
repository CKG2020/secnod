package com.nyspringnetty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigServerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EchoServer server = (EchoServer) context.getBean("EchoServer");
        server.run();
//        try {
//            Thread.sleep(Long.parseLong("5000"));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



    }


}
