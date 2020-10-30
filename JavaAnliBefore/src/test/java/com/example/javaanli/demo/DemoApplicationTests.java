package com.example.javaanli.demo;

import com.example.javaanli.demo.Model.Record;
import com.example.javaanli.demo.mapper.RecordMapper;
import com.example.javaanli.demo.service.RecordServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
//    private RecordServiceImpl recordService;

    private RecordMapper recordMapper;

  @Test
    public void findall(){

        List<Record> all = recordMapper.findAll();


        for (Record a:
                all
             ) {
            System.out.println(a);

        }
    }


}


