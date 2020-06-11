package com.example.javaanli.demo.service;

import com.example.javaanli.demo.Model.Teacher;
import com.example.javaanli.demo.mapper.TeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
@Service
public class TeaServiceImpl implements TeaMapper {
    @Autowired
    private  TeaMapper  teaMapper;

    public Teacher findByNumAndPassword(String tea_number,String tea_password){
        return  teaMapper.findByNumAndPassword(tea_number,tea_password);

    }


}
