package com.xxx.book.model.pojo;

import java.util.Date;

public class Book {
    private String isbn;

    private String cover;

    private String bookname;

    private String author;

    private Long price;

    private Byte cd;

    private String publish;

    private Integer bookclassifyid;

    private Date createtime;

    private String remark;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Byte getCd() {
        return cd;
    }

    public void setCd(Byte cd) {
        this.cd = cd;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public Integer getBookclassifyid() {
        return bookclassifyid;
    }

    public void setBookclassifyid(Integer bookclassifyid) {
        this.bookclassifyid = bookclassifyid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}