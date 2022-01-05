package com.xxx.book.model.pojo;

import java.util.Date;

public class BookReturn {
    private Integer id;

    private Integer bookid;

    private Date returntime;

    private Byte isovertime;

    private Integer borrowid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public Byte getIsovertime() {
        return isovertime;
    }

    public void setIsovertime(Byte isovertime) {
        this.isovertime = isovertime;
    }

    public Integer getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(Integer borrowid) {
        this.borrowid = borrowid;
    }
}