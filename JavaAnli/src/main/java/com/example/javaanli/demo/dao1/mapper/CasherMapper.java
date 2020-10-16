package com.example.javaanli.demo.dao1.mapper;

import com.example.javaanli.demo.entity1.Casher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

@Repository
public interface CasherMapper {

    @Select("SELECT * FROM casher  WHERE name=#{name,jdbcType=VARCHAR} AND password=#{password,jdbcType=VARCHAR}")
    public Casher findByNumAndPassword(@Param("name") String stu_number, @Param("password") String stu_password);
}
