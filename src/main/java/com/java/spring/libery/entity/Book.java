package com.java.spring.libery.entity;

import java.util.Arrays;

/**
 * Created by timur_000 on 11.10.2016.
 */
public class Book {
    private int id;
    private String name;
    private Integer pageCount;
    private Integer publishYear;
    private Publisher publisherId;
    private Genre genreId;
    private String isbn;
    private String description;
    private Double rating;
    private Integer voteCount;
    private byte[] image;
    private byte[] content;
    private Author authoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Publisher getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Publisher publisherId) {
        this.publisherId = publisherId;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Author getAuthoId() {
        return authoId;
    }

    public void setAuthoId(Author authoId) {
        this.authoId = authoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (pageCount != null ? !pageCount.equals(book.pageCount) : book.pageCount != null) return false;
        if (publishYear != null ? !publishYear.equals(book.publishYear) : book.publishYear != null) return false;
        if (publisherId != null ? !publisherId.equals(book.publisherId) : book.publisherId != null) return false;
        if (genreId != null ? !genreId.equals(book.genreId) : book.genreId != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        if (rating != null ? !rating.equals(book.rating) : book.rating != null) return false;
        if (voteCount != null ? !voteCount.equals(book.voteCount) : book.voteCount != null) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (!Arrays.equals(content, book.content)) return false;
        return authoId != null ? authoId.equals(book.authoId) : book.authoId == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pageCount != null ? pageCount.hashCode() : 0);
        result = 31 * result + (publishYear != null ? publishYear.hashCode() : 0);
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (voteCount != null ? voteCount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (authoId != null ? authoId.hashCode() : 0);
        return result;
    }
}
