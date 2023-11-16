package com.dao;

import com.domain.addANDemail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface addANDemailDao {
    @Insert("insert into buyerimformation_table(address,email,shop_name) values(#{address},#{email},#{shop_name})")
    public int save(addANDemail aDe);

    @Select("select * from buyerimformation_table")
    public List<addANDemail> getall();
}
