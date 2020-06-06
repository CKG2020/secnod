package com.example.javaanli.demo.service;

import com.example.javaanli.demo.Model.Student;
import com.example.javaanli.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuMapper{
    @Autowired
    private StuMapper stuMapper;




    public boolean register(Student student){
        return false;
 }

    public Student findStuBySno(String sno) {
        return stuMapper.findStuBySno(sno);
    }


    @Override
    public Student findByNumAndPassword(String stu_number, String stu_password) {
        return stuMapper.findByNumAndPassword(stu_number,stu_password);

    }

    public int  addUser(String sno1, String s, String sno, String spwd) {
        return  stuMapper.addUser(sno1,s,sno,spwd);
    }
}

