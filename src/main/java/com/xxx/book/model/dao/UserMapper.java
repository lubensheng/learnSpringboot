package com.xxx.book.model.dao;

import com.xxx.book.model.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserName(User record);
}