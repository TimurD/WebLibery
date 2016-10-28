package com.java.spring.libery.interfaces;

import com.java.spring.libery.entity.Author;
import com.java.spring.libery.entity.Book;
import com.java.spring.libery.entity.Genre;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by timur_000 on 05.10.2016.
 */
@Component
public interface BookSearch {

    List<Book> showBooks();
    List<Book> showBooks(Author author);
    List<Book> showBooks(String bookName);
    List<Book> showBooks(Character firstLater);
    List<Book> showBooks(Genre genre);
    Object getFieldValue(Long id,String filename);
}
