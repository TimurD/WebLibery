package com.java.spring.libery.interfaces;

import com.java.spring.libery.classes.Book;

/**
 * Created by timur_000 on 05.10.2016.
 */
public interface ShowBook {

    void showBook(Book book);
    void downloadBook(Book book);
    void rateBook(Book book);
}
