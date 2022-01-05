package com.xxx.book.controller;

import com.xxx.book.model.pojo.Book;
import com.xxx.book.service.imp.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/bookService")
public class BookController {

  @Autowired
  BookServiceImp bookServiceImp;

  @GetMapping("/getBookInfo")
  @ResponseBody
  public ArrayList<Book> getBookInfo() {
    return bookServiceImp.getBooks();
  }
}
