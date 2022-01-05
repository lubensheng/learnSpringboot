package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.Bookclassify;
import org.springframework.stereotype.Repository;

@Repository
public interface BookclassifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bookclassify record);

    int insertSelective(Bookclassify record);

    Bookclassify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bookclassify record);

    int updateByPrimaryKey(Bookclassify record);
}