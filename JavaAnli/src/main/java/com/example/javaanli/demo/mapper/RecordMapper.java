package com.example.javaanli.demo.mapper;

import com.example.javaanli.demo.Model.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordMapper {
    @Select("SELECT * FROM record_info  WHERE stu_name=#{stu_name,jdbcType=VARCHAR}")
    public Record findBySname(@Param("stu_name") String stu_name);

    @Select("SELECT * FROM record_info  WHERE stu_class=#{stu_class,jdbcType=VARCHAR}")
    public List<Record> findByClass(@Param("stu_class") String stu_class);


    @Select("SELECT * FROM record_info  WHERE stu_number=#{stu_number,jdbcType=VARCHAR}")
    public Record findBySno(@Param("stu_number") String stu_number);


    @Select("SELECT * FROM record_info  ")
    public List<Record> findAll( );


    @Insert("INSERT INTO record_info  (stu_number,stu_class,stu_name,qingjia_time,start_time,end_time,qingjia_reason) VALUES" +
            " (#{stu_number},#{stu_class},#{stu_name},#{qingjia_time},#{start_time},#{end_time},#{qingjia_reason})")
    int addRecord(@Param("stu_number") String stu_number,@Param("stu_class") String stu_class, @Param("stu_name") String stu_name,
                   @Param("qingjia_time") String qingjia_time, @Param("start_time") String start_time,@Param("end_time") String end_time,
                  @Param("qingjia_reason") String qingjia_reason);


    @Select("SELECT class_tea_status  FROM record_info  where stu_number=#{stu_number,jdbcType=VARCHAR}")
       String  querrystatus(@Param("stu_number") String stu_number);



}
