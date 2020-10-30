package com.FourDataFormat.json;

public class Person {

    private  int age;
    private String fullname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Person(int age, String fullname) {
        this.age = age;
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
