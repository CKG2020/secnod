package com.ckg.service;

import com.ckg.dao.BookDao;
import com.ckg.entity.Book;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    BookDao bookDao;


    public List<Book> xxx(String author){
        List<Book> booksByAuthorStartingWith = bookDao.getBooksByAuthorStartingWith(author);
        return  booksByAuthorStartingWith;

    }

    public  List<Book> yyy(String author, Integer id){
        List<Book> booksByIdAndAuthor = bookDao.getBooksByIdAndAuthor(author, id);
        return booksByIdAndAuthor;

    }





}
