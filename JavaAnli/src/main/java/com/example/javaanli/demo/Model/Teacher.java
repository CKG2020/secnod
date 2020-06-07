package com.example.javaanli.demo.Model;
import lombok.Data;
import org.springframework.context.annotation.Bean;
@Data
public class Teacher {

    private int id;
    private String tea_number;
    private String tea_name;
    private String tea_password;
}
