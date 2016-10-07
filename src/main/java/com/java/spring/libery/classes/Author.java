package com.java.spring.libery.classes;

import java.util.Date;

/**
 * Created by timur_000 on 05.10.2016.
 */
public class Author {

   private String fio;
    private Date birth;

    public Author() {
    }

    public Author(String fio, Date birth) {
        this.fio = fio;
        this.birth = birth;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
