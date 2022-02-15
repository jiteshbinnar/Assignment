package com.spring;

public class Author {
    private String  name;
    private String country;
    private int authorId;
    private Book book;

    public Author(String name, String country, int authorId, Book book) {
        this.name = name;
        this.country = country;
        this.authorId = authorId;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", authorId=" + authorId +
                ", book=" + book +
                '}';
    }

}
