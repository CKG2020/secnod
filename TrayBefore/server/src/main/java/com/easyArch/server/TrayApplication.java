package com.easyArch.server;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.easyArch.server")
public class TrayApplication{
//    public static void main(String[] args) throws Exception {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TrayApplication.class);
//        Server bean = context.getBean(Server.class);
//        context.start();
//        RpcProviderFactory factory=new RpcProviderFactory();
//        factory.addService(API.class.getName(),null,bean);
//
//        factory.start();
//        while(!Thread.currentThread().isInterrupted()){
//            TimeUnit.HOURS.sleep(1);
//        }
//        factory.stop();
//    }

}
