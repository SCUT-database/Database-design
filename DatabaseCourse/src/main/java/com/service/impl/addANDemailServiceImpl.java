package com.service.impl;

import com.dao.addANDemailDao;
import com.domain.Account;
import com.domain.addANDemail;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class addANDemailServiceImpl {
    @Autowired
    private addANDemailDao aAeDao;

    public boolean save(addANDemail aAe){
        return aAeDao.save(aAe) > 0;
    }

    public List<addANDemail> getall(){
        return aAeDao.getall();
    }
}
