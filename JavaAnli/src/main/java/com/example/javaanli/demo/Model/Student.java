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


}
