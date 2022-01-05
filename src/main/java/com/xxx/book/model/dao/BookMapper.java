package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BookMapper {
    int deleteByPrimaryKey(String isbn);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String isbn);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    ArrayList<Book> selectAllData();
}