package com.java.spring.libery.interfaces;

import com.java.spring.libery.classes.Author;
import com.java.spring.libery.classes.Book;

import java.util.List;

/**
 * Created by timur_000 on 05.10.2016.
 */
public interface BookSearch {

    List<Book> showBooks();
    List<Book> showBooks(Author author);
    List<Book> showBooks(String bookName);
    List<Book> showBooks(Character firstLater);
}
