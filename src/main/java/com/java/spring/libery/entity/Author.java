package com.java.spring.libery.entity;

import java.sql.Date;

/**
 * Created by timur_000 on 11.10.2016.
 */
public class Author {
    public Author() {
    }

    public Author(String secondName) {
        this.secondName = secondName;
    }

    private int id;
    private String firstName;
    private Date birth;
    private String secondName;

    @Override
    public String toString() {
        return secondName+" "+firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (id != author.id) return false;
        if (firstName != null ? !firstName.equals(author.firstName) : author.firstName != null) return false;
        if (birth != null ? !birth.equals(author.birth) : author.birth != null) return false;
        if (secondName != null ? !secondName.equals(author.secondName) : author.secondName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        return result;
    }
}
