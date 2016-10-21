package com.java.spring.libery.objects;

import com.java.spring.libery.classes.BookSearchImol;
import com.java.spring.libery.entity.Book;
import com.java.spring.libery.interfaces.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by timur_000 on 20.10.2016.
 */
@Component
public class LibraryFacade {


    private BookSearch bookSearch;
    private List<Book> books;

    @Autowired
    public void setBookDAO(BookSearch bookSearch){
        this.bookSearch=bookSearch;
        books=bookSearch.showBooks();
    }

    public List<Book>getBooks(){
        return books;
    }

}
