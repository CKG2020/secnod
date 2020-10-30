package com.AutoDB;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface  field {
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface  mytable {
}


@mytable
public class Person {
    @field
    private int id;
    @field
    private String pname;

}
