package com.xxx.book.model.pojo;

public class BookEntity {
    private Integer id;

    private String isbn;

    private Byte isborrow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Byte getIsborrow() {
        return isborrow;
    }

    public void setIsborrow(Byte isborrow) {
        this.isborrow = isborrow;
    }
}