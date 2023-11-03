package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Insert("insert into account_table (id,password) values(#{id},#{password})")
    public int save(Book book);
    @Update("update account_table set password = #{password} where id = #{id}")
    public int update(Book book);
    @Select("select * from account_table where id = #{id}")
    public Book  getbyID(String id);
    @Select("select * from account_table where type = #{type}")
    public List<Book> getbyType(String type);
    @Select("select * from account_table")
    public List<Book> getall();
}
