package com.seo.springextend.Domain;

import com.seo.springextend.Repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@DataJpaTest
// public 생략가능
class BookTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    void saveBook(){
        Book book = new Book();
        book.setIsbn("123123");
        book.setTitle("스프링");
        book.setPublished(LocalDate.of(2020,10,10));
        Book saveBook = bookRepository.save(book);
        assertNotNull(saveBook);
        assertEquals("스프링",saveBook.getTitle());
    }
}