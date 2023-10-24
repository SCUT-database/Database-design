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
        accountdao.save(account);
        return true;
    }
    public boolean update(Account account){
        accountdao.update(account);
        return true;
    }
    public boolean delete(String ID){
        accountdao.delete(ID);
        return true;
    }
    public Account getbyID(String ID){
        return accountdao.getbyID(ID);
    }
    public List<Account> getall(){
        return accountdao.getall();
    }

}
