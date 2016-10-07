package com.java.spring.libery.classes;

/**
 * Created by timur_000 on 05.10.2016.
 */
public class Book {

    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private byte[] image;
    private String ISBN;
    private Integer pageCount;
    private Integer publishYear;
    private String description;
    private Double rating;
    private Long voteCount;

    public Book() {
    }

    public Book(Author author, Genre genre, Publisher publisher, String name, byte[] content, byte[] image, String ISBN, Integer pageCount, Integer publishYear, String description, Double rating, Long voteCount) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.image = image;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.publishYear = publishYear;
        this.description = description;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
