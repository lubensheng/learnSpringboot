package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.Dept;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}