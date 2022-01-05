package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.BookEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BookEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookEntity record);

    int insertSelective(BookEntity record);

    BookEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookEntity record);

    int updateByPrimaryKey(BookEntity record);
}