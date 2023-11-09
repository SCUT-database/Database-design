package com.service.impl;

import com.dao.BookDao;
import com.domain.Account;
import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    public boolean save(Book book){
        return bookDao.save(book) > 0;
    }
    public List<Book> getbyType(String type){
        return bookDao.getbyType(type);
    }
    public List<Book>getbyname(String name){
        return bookDao.getbyname(name);
    }
    public List<Book> getall(){
        return bookDao.getall();
    }

}
