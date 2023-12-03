package com.controller;

import com.domain.Account;
import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("bookcontroller")
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping()
    public Result save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping()
    public Result update(@PathVariable String name){
        boolean flag = bookService.update(name);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @GetMapping("/byName/{name}")
    public Result getbyname(@PathVariable String name){
        List<Book> bookList = bookService.getbyname(name);
        Integer code = bookList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = bookList!=null ? "" : "查询失败！请重试";
        return new Result(code,bookList,message);
    }

    @GetMapping("/byType/{type}")
    public Result getbyType(@PathVariable String type){
        List<Book> bookList = bookService.getbyType(type);
        Integer code = bookList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = bookList!=null ? "" : "查询失败！请重试";
        return new Result(code,bookList,message);
    }

    @GetMapping("/byShop/{shopName}")
    public Result getShopBook(@PathVariable String shopName){
        List<Book> bookList = bookService.getShopBook(shopName);
        Integer code = bookList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = bookList!=null ? "" : "查询失败！请重试";
        return new Result(code,bookList,message);
    }

    @GetMapping()
    public Result getall(){
        List<Book> booktList = bookService.getall();
        Integer code = booktList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = booktList!=null ? "" : "查询失败！请重试";
        return new Result(code,booktList,message);
    }

    @DeleteMapping("/{name}")
    public Result delete(@PathVariable String name){
        boolean flag = bookService.delete(name);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
}
