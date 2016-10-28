package com.java.spring.libery.objects;

import com.java.spring.libery.classes.BookSearchImol;
import com.java.spring.libery.entity.Author;
import com.java.spring.libery.entity.Book;
import com.java.spring.libery.interfaces.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by timur_000 on 20.10.2016.
 */
@Component("libraryFacade")
@Scope("singleton")
public class LibraryFacade {
    private static final String FIELD_CONTENT="content";

    private BookSearch bookSearch;
    private List<Book> books;
    @Autowired
    private SearchCriteria searchCriteria;

    @Autowired
    public void setBookDAO(BookSearch bookSearch){
        this.bookSearch=bookSearch;
        books=bookSearch.showBooks();
    }
    public void searchBooksByLetter(){
        books=bookSearch.showBooks(searchCriteria.getLetter());
    }
    public List<Book>getBooks(){
        return books;
    }

    public void searchByGenre(){
        books=bookSearch.showBooks(searchCriteria.getGenre());
    }
    public void searchBooksByText(){
        switch (searchCriteria.getSearchType()){
            case TITLE:
                books=bookSearch.showBooks(searchCriteria.getText());
                break;
            case AUTHOR:
                books=bookSearch.showBooks(new Author(searchCriteria.getText()));
                break;
        }
    }
    public byte[]getContent(long id){
        return (byte[])bookSearch.getFieldValue(id,FIELD_CONTENT);
    }

}
