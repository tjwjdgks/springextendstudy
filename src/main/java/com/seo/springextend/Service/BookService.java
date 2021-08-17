package com.seo.springextend.Service;

import com.seo.springextend.Domain.Book;
import com.seo.springextend.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    // 비동기적으로
    @Async
    public void hello(){
        System.out.println("book hello" + Thread.currentThread().getName());
    }
    /*
    @Scheduled(fixedDelay = 1000 * 2)
    public void hi(){
        System.out.println("hi"+ Thread.currentThread().getName());
    }

     */
    /*
    @PostConstruct
    public void init(){
        Book book = new Book();
        book.setIsbn("123123");
        book.setTitle("스프링");
        book.setPublished(LocalDate.of(2020,10,10));

    }

     */
}
