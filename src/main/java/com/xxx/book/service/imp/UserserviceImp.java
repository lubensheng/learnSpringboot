package com.xxx.book.service.imp;

import com.xxx.book.model.dao.UserMapper;
import com.xxx.book.model.pojo.User;
import com.xxx.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImp implements UserService {

  @Autowired
  UserMapper userMapper;

  @Override
  public User getUser(User user) {
    return userMapper.selectByUserName(user);
  }
  @Override
  public void setUser(User user) {userMapper.insert(user);}
}
