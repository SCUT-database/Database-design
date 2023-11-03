package com.service;

import com.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AccountService {
    //要返回服务端是否成功
    public boolean save(Account account);
    public boolean update(Account account);
    public boolean delete(String ID);
    public Account getbyID(String ID);
    public List<Account> getall();
}
