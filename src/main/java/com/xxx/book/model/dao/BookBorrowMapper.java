package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.BookBorrow;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookBorrow record);

    int insertSelective(BookBorrow record);

    BookBorrow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookBorrow record);

    int updateByPrimaryKey(BookBorrow record);
}