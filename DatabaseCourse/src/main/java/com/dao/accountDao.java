package com.dao;

import com.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into account_table (id,password) values(#{id},#{password})")
    public int save(Account account);
    @Update("update account_table set password = #{password} where id = #{id}")
    public int update(Account account);
    @Delete("delete from account_table where id = #{id}")
    public int delete(String ID);
    @Select("select * from account_table where id = #{id}")
    public Account getbyID(String ID);
    @Select("select * from account_table")
    public List<Account> getall();
}
