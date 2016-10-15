package com.java.spring.libery.classes;

import com.java.spring.libery.entity.*;
import com.java.spring.libery.entity.Author;
import com.java.spring.libery.entity.Book;
import com.java.spring.libery.interfaces.BookSearch;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by timur_000 on 15.10.2016.
 */
@Component
public class BookSearchImol implements BookSearch {

    @Autowired
    SessionFactory sessionFactory;

    List <Book>books;

    @Transactional
    public List<Book> showBooks() {

        books = (List<Book>) sessionFactory.getCurrentSession().createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return books;
    }

    public List<Book> showBooks(Author author) {
        return null;
    }

    public List<Book> showBooks(String bookName) {
        return null;
    }

    public List<Book> showBooks(Character firstLater) {
        return null;
    }
}
