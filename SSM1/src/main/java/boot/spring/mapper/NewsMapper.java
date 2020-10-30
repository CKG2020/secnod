package boot.spring.mapper;


import boot.spring.po.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {


    @Select("SELECT * FROM news ")
     List<News> findAllNews();


    @Insert("INSERT INTO news  (subject,name,time,message) VALUES (#{subject},#{name},#{time},#{message})")
    public int addNews(@Param("subject") String subject, @Param("name") String name, @Param("time") String time, @Param("message") String message);


    @Update("UPDATE  news  set  subject=#{subject,jdbcType=VARCHAR},time=#{time,jdbcType=VARCHAR},message=#{message,jdbcType=VARCHAR}  where name=#{name,jdbcType=VARCHAR}")
    int updateNews(@Param("subject") String subject, @Param("name") String name, @Param("time") String time, @Param("message") String message);


    @Delete("DELETE FROM news WHERE id=#{id,jdbcType=INTEGER}")
     void deleteNews(@Param("id") int id);



    @Select("SELECT * FROM news where id=#{id,jdbcType=INTEGER} ")
    News findOneNews(@Param("id") int id);



}
