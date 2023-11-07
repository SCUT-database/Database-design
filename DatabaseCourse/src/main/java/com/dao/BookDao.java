package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Insert("insert into book_table (id,password) values(#{id},#{password})")
    public int save(Book book);
    @Select("select * from book_table where book_name = #{name}")
    public Book getbyname(String name);
    @Select("select * from book_table where book_type = #{type}")
    public List<Book> getbyType(String type);
    @Select("select * from book_table")
    public List<Book> getall();
}
