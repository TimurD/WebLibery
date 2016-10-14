package com.java.spring.libery.beans;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by timur_000 on 13.10.2016.
 */

@Component
public class TestBean {
    @Autowired
    private SessionFactory sessionFactory;

    public void test(){
        System.out.println("Session factory = "+sessionFactory);
    }
}
