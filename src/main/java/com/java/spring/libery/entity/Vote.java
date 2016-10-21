package com.java.spring.libery.entity;

/**
 * Created by timur_000 on 11.10.2016.
 */
public class Vote {
    private int id;
    private Integer value;
    private Integer bookId;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (id != vote.id) return false;
        if (value != null ? !value.equals(vote.value) : vote.value != null) return false;
        if (bookId != null ? !bookId.equals(vote.bookId) : vote.bookId != null) return false;
        if (username != null ? !username.equals(vote.username) : vote.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", value=" + value +
                ", bookId=" + bookId +
                ", username='" + username + '\'' +
                '}';
    }
}
