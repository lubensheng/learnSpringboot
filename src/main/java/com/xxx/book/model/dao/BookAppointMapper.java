package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.BookAppoint;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAppointMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookAppoint record);

    int insertSelective(BookAppoint record);

    BookAppoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookAppoint record);

    int updateByPrimaryKey(BookAppoint record);
}