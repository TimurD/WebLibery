package com.java.spring.libery.classes;

import com.java.spring.libery.entity.*;
import com.java.spring.libery.entity.Author;
import com.java.spring.libery.entity.Book;
import com.java.spring.libery.entity.Genre;
import com.java.spring.libery.interfaces.BookSearch;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.Transformer;
import java.util.List;

/**
 * Created by timur_000 on 15.10.2016.
 */
@Component
public class BookSearchImol implements BookSearch {



    ProjectionList bookProjection;

    public BookSearchImol(){
        bookProjection= Projections.projectionList();
        bookProjection.add(Projections.property("id"),"id");
        bookProjection.add(Projections.property("name"),"name");
        bookProjection.add(Projections.property("pageCount"),"pageCount");
        bookProjection.add(Projections.property("publishYear"),"publishYear");
        bookProjection.add(Projections.property("publisherId"),"publisherId");
        bookProjection.add(Projections.property("genreId"),"genreId");
        bookProjection.add(Projections.property("isbn"),"isbn");
        bookProjection.add(Projections.property("description"),"description");
        bookProjection.add(Projections.property("rating"),"rating");
        bookProjection.add(Projections.property("voteCount"),"voteCount");
        bookProjection.add(Projections.property("image"),"image");
        bookProjection.add(Projections.property("authoId"),"authoId");


    }

    @Autowired
    SessionFactory sessionFactory;

     List <Book>books;

    @Transactional
    public List<Book> showBooks() {
        books=createBookList(createBookCriteria());
        return books;
    }

    @Transactional
    public List<Book> showBooks(Author author) {
        books=createBookList(createBookCriteria().add(Restrictions.ilike("authoId.secondName",author.getSecondName(),MatchMode.ANYWHERE)));
        return books;
    }
    @Transactional
    public List<Book> showBooks(String bookName) {
        books=createBookList(createBookCriteria().add(Restrictions.ilike("b.name",bookName,MatchMode.ANYWHERE)));
        return books;
    }
    @Transactional
    public List<Book> showBooks(Character firstLater) {
        books=createBookList(createBookCriteria().add(Restrictions.ilike("b.name",firstLater.toString(),MatchMode.START)));
        return books;
    }
    @Transactional
    public List<Book> showBooks(Genre genre) {
         books = createBookList(createBookCriteria().add(Restrictions.eq("genreId.id", genre.getId())));
        return books;
    }

    @Transactional
    public Object getFieldValue(Long id, String filename) {
        Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Book.class);
        criteria.setProjection(Property.forName(filename));
        criteria.add(Restrictions.eq("id",id));
        return criteria.uniqueResult();
    }


    public DetachedCriteria createBookCriteria (){
        DetachedCriteria bookListCriteria=DetachedCriteria.forClass(Book.class,"b");
        createAliases(bookListCriteria);
        return bookListCriteria;
    }

    public void createAliases(DetachedCriteria criteria){
        criteria.createAlias("b.authoId","authoId");
        criteria.createAlias("b.publisherId","publisherId");
        criteria.createAlias("b.genreId","genreId");
    }
    private List<Book>createBookList(DetachedCriteria bookListCriteria){
        Criteria criteria=bookListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("b.name")).setProjection(bookProjection).setResultTransformer(Transformers.aliasToBean(Book.class));
        return criteria.list();
    }
}
