package com.dao;

import com.domain.Account;
import com.domain.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShopDao {
    @Insert("insert into shop_table (shop_name,shop_password) values(#{shop_name},#{shop_password})")
    public int save(Shop shop);
    @Select("select * from shop_table where shop_name = #{name}")
    public Shop getbyID(String name);
    @Select("select * from shop_table")
    public List<Shop> getall();
}