package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.BookLose;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLoseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookLose record);

    int insertSelective(BookLose record);

    BookLose selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookLose record);

    int updateByPrimaryKey(BookLose record);
}