package com.xxx.book.controller;

import com.xxx.book.common.ReturnCodeAndMessage;
import com.xxx.book.model.pojo.User;
import com.xxx.book.service.UserService;
import com.xxx.book.utils.ReturnMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins={"http://127.0.0.1:8081", "http://localhost:3000"})
@Controller
@RequestMapping("/api/userService")
public class UserController {
  @Autowired
  UserService userService;

  @PostMapping("/getUserInfo")
  @ResponseBody
  public ReturnMessage<User> getUserInfo(@RequestBody User user) {
    User user1 = userService.getUser(user);
    ReturnMessage<User> returnMessage = new ReturnMessage<User>();
    returnMessage.setMessage("success");
    returnMessage.setCode(200);
    returnMessage.setData(user1);
    if (user1 == null) {
      returnMessage.setMessage("暂未查到数据!, 请重新注册");
    }
    return returnMessage;
  }

  @PostMapping("/register")
  @ResponseBody
  public ReturnMessage<User> register(@RequestBody User user) {
    ReturnMessage<User> returnMessage = new ReturnMessage<User>();
    User user1 = userService.getUser(user);
    // ReturnCodeAndMessage returnCodeAndMessage = new ReturnCodeAndMessage(ReturnCodeAndMessage.SUCCESS_MESSAGE_AND_CODE.getMessage(), ReturnCodeAndMessage.SUCCESS_MESSAGE_AND_CODE.getCode());
    if (user1 != null) {

    }
    returnMessage.setMessage("success");
    returnMessage.setCode(200);
    returnMessage.setData(user);
    return returnMessage;
  }
}
