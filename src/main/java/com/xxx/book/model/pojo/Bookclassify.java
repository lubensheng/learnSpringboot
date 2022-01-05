package com.xxx.book.model.pojo;

import java.util.Date;

public class Bookclassify {
    private Integer id;

    private String bookclassifyname;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookclassifyname() {
        return bookclassifyname;
    }

    public void setBookclassifyname(String bookclassifyname) {
        this.bookclassifyname = bookclassifyname == null ? null : bookclassifyname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}