package com.example.javaanli.demo.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;


@Component
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Syslog {
    String value() default "";
}
