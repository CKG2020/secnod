package com.example.javaanli.demo.dao1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Repository
public interface LogInfoMapper {
    @Insert("INSERT INTO log_info  (log_op,log_type,create_time,url) VALUES (#{log_op},#{log_type},#{create_time},#{url})")
    public int insertLog(@Param("log_op") String log_op, @Param("log_type") String log_type, @Param("create_time") Date create_time, @Param("url") String url);


}
