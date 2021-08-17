package com.seo.springextend.Controller;

import com.seo.springextend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public String book(){
        bookService.hello();
        return "hello";
    }
}
