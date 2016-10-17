package com.java.spring.libery.classes;

import com.java.spring.libery.entity.*;
import com.java.spring.libery.entity.Genre;
import com.java.spring.libery.interfaces.ShowGenre;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by timur_000 on 17.10.2016.
 */
@Component
public class GenreSearchImpl  implements ShowGenre{
    @Autowired
    SessionFactory sessionFactory;


    @Transactional
    public List<Genre> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
    }
}
