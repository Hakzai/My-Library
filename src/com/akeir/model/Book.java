package com.akeir.model;

public class Book{

    private int id;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private int year;
    private int edition;
    private int pages;
    private String isbn;
    private String language;
    private String status;

    public Book()
    {

    }

    // Book creation
    public Book(String title, String author, String genre, String publisher, int year, int edition, int pages, String isbn, String language, String status)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.edition = edition;
        this.pages = pages;
        this.isbn = isbn;
        this.language = language;
        this.status = status;
    }

    // Book edition
    public Book(int id, String title, String author, String genre, String publisher, int year, int edition, int pages, String isbn, String language, String status)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.edition = edition;
        this.pages = pages;
        this.isbn = isbn;
        this.language = language;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
