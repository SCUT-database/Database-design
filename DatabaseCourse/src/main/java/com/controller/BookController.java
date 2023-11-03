package com.controller;

import com.domain.Account;
import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping()
    public BookResult save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new BookResult(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    };

    @PostMapping()
    public BookResult update(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new BookResult(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{id}")
    public BookResult getbyID(@PathVariable String id){
        Book book = bookService.getbyID(id);
        Integer code = book!=null ? Code.GET_OK : Code.GET_ERR;
        String message = book!=null ? "" : "查询失败！请重试";
        return new BookResult(code,book,message);
    }

    @GetMapping("/{type}")
    public BookResult getbyType(@PathVariable String type){
        List<Book> bookList = bookService.getbyType(type);
        Integer code = bookList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = bookList!=null ? "" : "查询失败！请重试";
        return new BookResult(code,bookList,message);
    }

    @GetMapping()
    public AccountResult getall(){
        List<Book> booktList = bookService.getall();
        Integer code = booktList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = booktList!=null ? "" : "查询失败！请重试";
        return new AccountResult(code,booktList,message);
    };
}
