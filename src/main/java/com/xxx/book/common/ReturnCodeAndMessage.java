package com.xxx.book.common;

public enum ReturnCodeAndMessage {
  SUCCESS_MESSAGE_AND_CODE("success", 200),
  ERROR_MESSAGE_AND_CODE("error", 500);

  private String message;
  private int code;
  ReturnCodeAndMessage(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
