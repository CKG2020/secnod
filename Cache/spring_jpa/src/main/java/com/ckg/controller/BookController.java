package com.ckg.controller;

import com.ckg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
@Autowired
    BookService bookService;

public  void xxx(){
    PageRequest pageRequest=PageRequest.of(2,3);

}
}
