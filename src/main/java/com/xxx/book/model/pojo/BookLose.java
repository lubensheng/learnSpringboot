package com.xxx.book.model.pojo;

import java.util.Date;

public class BookLose {
    private Integer id;

    private Integer bookid;

    private Date createtime;

    private Byte isfind;

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsfind() {
        return isfind;
    }

    public void setIsfind(Byte isfind) {
        this.isfind = isfind;
    }
}