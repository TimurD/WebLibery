package com.java.spring.libery.classes;

/**
 * Created by timur_000 on 05.10.2016.
 */
public class Genre {
    private String name;

    public Genre() {
    }

    public Genre(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
