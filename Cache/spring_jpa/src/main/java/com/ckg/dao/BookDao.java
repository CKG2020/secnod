package com.ckg.dao;

import com.ckg.entity.Book;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> getBooksByAuthorStartingWith(String author);
    List<Book> getBooksByPriceGreaterThan(Float price);
    //上面两种是jpa自定义的查询方法
//
//    @Query(value = "select * from t_book where id=(select max(id) from t_book)",nativeQuerry=true)
//    Book getMaxIdBook();
    @Query("select b from t_book b where b.id>:id and b.author=:author")
    List<Book> getBooksByIdAndAuthor(@Param("author") String author,@Param("id") Integer id);
//    这种是用户自定义的查询模板

}
