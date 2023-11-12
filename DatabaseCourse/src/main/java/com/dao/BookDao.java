package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Insert("insert into book_table (book_name,book_price,book_type,book_number) values(#{book_name},#{book_price},#{book_type},#{book_number})")
    public int save(Book book);
    @Select("select * from book_table where book_name = #{name}")
    public List<Book> getbyname(String name);
    @Select("select * from book_table where book_type = #{type}")
    public List<Book> getbyType(String type);
    @Select("select * from book_table")
    public List<Book> getall();
    @Update("update book_table set book_number = book_number - 1 where book_name = #{name}")
    public int update(String name);
}
