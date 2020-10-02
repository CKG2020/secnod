package com.example.javaanli.demo.service;

import com.example.javaanli.demo.Model.Record;
import com.example.javaanli.demo.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecordServiceImpl implements RecordMapper {
@Autowired
private RecordMapper recordMapper;
    @Override
    public Record findBySname(String stu_name) {
        return  recordMapper.findBySname(stu_name);
    }

    @Override
    public List<Record> findByClass(String stu_class) {
        return recordMapper.findByClass(stu_class);
    }

    @Override
    public Record findBySno(String stu_number) {
        return recordMapper.findBySno(stu_number);
    }

    @Override
    public List<Record> findAll() {
        return recordMapper.findAll();
    }

    public int addRecord(String stu_number, String stu_class, String stu_name, String qingjia_time, String start_time, String end_time,String qingjia_reason) {
        return recordMapper.addRecord(stu_number,stu_class,stu_name,qingjia_time,start_time,end_time,qingjia_reason);
    }

    @Override
    public String querrystatus(String stu_number) {
        return recordMapper.querrystatus(stu_number);
    }

    @Override
    public int deleteRecord(String stu_number) {
        return recordMapper.deleteRecord(stu_number);
    }

    public List<Record> findpage(Integer valueOf, Integer valueOf1) {

        return recordMapper.findpage(valueOf,valueOf1);

    }

    @Override
    public int tongyi(String stu_number) {
        return  recordMapper.tongyi(stu_number);
    }

    @Override
    public int fangdui(String stu_number) {
        return  recordMapper.fangdui(stu_number);
    }


//    public List<Record> findpage(Integer valueOf, Integer valueOf1) {
//
//
//    }
}