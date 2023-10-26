package com.service.impl;

import com.dao.AccountDao;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountdao;
    public boolean save(Account account){
        return accountdao.save(account) > 0;
    }
    public boolean update(Account account){
        return accountdao.update(account) > 0;
    }
    public boolean delete(String ID){
        return accountdao.delete(ID) > 0;
    }
    public Account getbyID(String ID){
        return accountdao.getbyID(ID);
    }
    public List<Account> getall(){
        return accountdao.getall();
    }

}
