package com.service;

import com.domain.Account;
import com.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean save(Book book);
    public boolean update(String name);
    public List<Book> getbyType(String type);
    public List<Book> getbyname(String id);
    public List<Book> getall();
}
