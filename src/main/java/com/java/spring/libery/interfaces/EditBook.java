package com.java.spring.libery.interfaces;

import com.java.spring.libery.entity.Book;

/**
 * Created by timur_000 on 05.10.2016.
 */
public interface EditBook {
    boolean deleteBook(Book book);
    boolean editBook(Book book);
    boolean saveBook(Book book);
    boolean addBook(Book book);
}
