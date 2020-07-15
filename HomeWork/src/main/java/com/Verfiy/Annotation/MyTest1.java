package com.Verfiy.Annotation;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface xxx {
}


public class MyTest1 {
    @xxx
    private  int id;
    private  String Sname;
}
