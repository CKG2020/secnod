package com.example.javaanli.demo.dao1.mapper;


import com.example.javaanli.demo.entity1.News;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {


    @Select("SELECT * FROM news ")
     List<News> findAllNews();
}
