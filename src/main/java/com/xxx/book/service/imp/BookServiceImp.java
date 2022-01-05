package com.xxx.book.service.imp;

import com.xxx.book.model.dao.BookMapper;
import com.xxx.book.model.pojo.Book;
import com.xxx.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServiceImp implements BookService {
  @Autowired
  BookMapper bookMapper;
  @Override
  public ArrayList<Book> getBooks() {
    return bookMapper.selectAllData();
  }
}
