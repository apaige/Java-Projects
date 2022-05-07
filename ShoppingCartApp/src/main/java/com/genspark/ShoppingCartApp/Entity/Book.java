package com.genspark.ShoppingCartApp.Entity;

import javax.persistence.Entity;

@Entity
public class Book extends Product{

    private String genre;
    private String author;
    private String publications;

    public Book() {
    }

    public Book(String genre, String author, String publications) {
        this.genre = genre;
        this.author = author;
        this.publications = publications;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }
}
