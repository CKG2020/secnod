package com.example.javaanli.demo.service1;

import com.example.javaanli.demo.dao1.mapper.LogInfoMapper;
import com.example.javaanli.demo.entity1.LogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.log.LogInputStream;

@Service
public class LogInfoServiceImpl {
    @Autowired
    private LogInfoMapper logInfoMapper;

    public int  insertLog(LogInfo log){
        int i = logInfoMapper.insertLog(log.getLogOp(),log.getLogType(),log.getCreateTime(),log.getUrl());

        return  i;
    }



}
