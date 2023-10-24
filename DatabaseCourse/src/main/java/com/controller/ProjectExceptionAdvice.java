//package com.controller;
//
//import com.exception.BusinessException;
//import com.exception.SystemException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
////业务异常 系统异常 其他异常
//
//@RestControllerAdvice//异常处理器
//public class ProjectExceptionAdvice {
//    @ExceptionHandler(Exception.class)
//    public AccountResult doException(Exception exception){
//        return new AccountResult(null,404,"exception");
//    }
//
//    @ExceptionHandler(SystemException.class)
//    public AccountResult doException(SystemException exception){
//        //记录日志
//        //logger.error("服务器发生异常：" + e.getMessage());
//        return new AccountResult(null,404,"exception");
//    }
//
//    @ExceptionHandler(Exception.class)
//    public AccountResult doException(BusinessException exception){
//        return new AccountResult(null,404,"exception");
//    }
//}
