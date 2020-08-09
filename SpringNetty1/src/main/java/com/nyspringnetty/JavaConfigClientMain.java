package com.nyspringnetty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigClientMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EchoClient echoClient = (EchoClient) context.getBean("EchoClient");
        echoClient.run();
    }
}
