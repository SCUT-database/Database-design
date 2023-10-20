package com.controller;

import com.dao.AccountDao;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping()
    public boolean save(@RequestBody Account account){
        accountService.save(account);
        return true;
    };
    @PutMapping()
    public boolean update(@RequestBody Account account){
        accountService.update(account);
        return true;
    };
    @DeleteMapping("/{id}")
    public boolean delete(String ID){
        accountService.delete(ID);
        return true;
    };
    @GetMapping("/{id}")
    public Account getbyID(String ID){
        return accountService.getbyID(ID);
    };
    @GetMapping()
    public List<Account> getall(){
        return accountService.getall();
    };


}
