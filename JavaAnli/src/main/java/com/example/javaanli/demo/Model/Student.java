package com.example.javaanli.demo.Model;
import lombok.Data;
import org.springframework.context.annotation.Bean;
@Data
public class Student {


    private int id;
    private String stu_number;
    private  String stu_password;
    private  String stu_name;
    private  String stu_class;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStu_number() {
        return stu_number;
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public String getStu_password() {
        return stu_password;
    }

    public void setStu_password(String stu_password) {
        this.stu_password = stu_password;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_class() {
        return stu_class;
    }

    public void setStu_class(String stu_class) {
        this.stu_class = stu_class;
    }
}
