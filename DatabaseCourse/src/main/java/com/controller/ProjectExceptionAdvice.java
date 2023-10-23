package com.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//业务异常 系统异常 其他异常

@RestControllerAdvice//异常处理器
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public AccountResult doException(Exception exception){
        return new AccountResult(null,404,"exception");
    }
}
