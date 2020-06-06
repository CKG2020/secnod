package com.example.javaanli.demo.mapper;

import com.example.javaanli.demo.Model.Student;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Repository
public interface StuMapper {

//    @Select("SELECT * FROM User  WHERE name=#{name,jdbcType=VARCHAR}")
//    public User findByName(@Param("name") String name);

    @Select("SELECT * FROM stu_info  WHERE stu_number=#{stu_number,jdbcType=VARCHAR} AND stu_password=#{stu_password,jdbcType=VARCHAR}")
    public Student findByNumAndPassword(@Param("stu_number") String stu_number, @Param("stu_password") String stu_password);

    @Insert("INSERT INTO stu_info  (stu_name,stu_number,stu_password,stu_class) VALUES (#{stu_name},#{sno},#{passwd},#{stu_class})")
    public int addUser(@Param("stu_name") String stu_name,@Param("sno") String stu_number, @Param("passwd") String stu_password,@Param("stu_class") String stu_class);

     @Select("SELECT * FROM stu_info  WHERE stu_number=#{stu_number,jdbcType=VARCHAR}")
    public Student findStuBySno( @Param("Stu_number") String sno);


}