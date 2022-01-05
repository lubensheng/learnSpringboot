package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.BookReturn;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReturnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookReturn record);

    int insertSelective(BookReturn record);

    BookReturn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookReturn record);

    int updateByPrimaryKey(BookReturn record);
}