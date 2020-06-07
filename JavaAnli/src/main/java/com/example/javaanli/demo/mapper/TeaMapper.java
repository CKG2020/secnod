package com.example.javaanli.demo.mapper;

import com.example.javaanli.demo.Model.Student;
import com.example.javaanli.demo.Model.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaMapper {


    @Select("SELECT * FROM tea_info  WHERE tea_number=#{tea_number,jdbcType=VARCHAR} AND tea_password=#{tea_password,jdbcType=VARCHAR}")
    public Teacher findByNumAndPassword(@Param("tea_number") String stu_number, @Param("tea_password") String stu_password);

//    @Insert("INSERT INTO stu_info  (stu_name,stu_number,stu_password,stu_class) VALUES (#{stu_name},#{sno},#{passwd},#{stu_class})")
//    public int addUser(@Param("stu_name") String stu_name,@Param("sno") String stu_number, @Param("passwd") String stu_password,@Param("stu_class") String stu_class);
//
//
}
