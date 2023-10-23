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
    public AccountResult save(@RequestBody Account account){
        boolean flag = accountService.save(account);
        return new AccountResult(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    };
    @PutMapping()
    public AccountResult update(@RequestBody Account account){
        boolean flag = accountService.update(account);
        return new AccountResult(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    };
    @DeleteMapping("/{id}")
    public AccountResult delete(@PathVariable String id){
        boolean flag = accountService.delete(id);
        return new AccountResult(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    };
    @GetMapping("/{id}")
    public AccountResult getbyID(@PathVariable String id){
        Account account = accountService.getbyID(id);
        Integer code = account!=null ? Code.GET_OK : Code.GET_ERR;
        String message = account!=null ? "" : "查询失败！请重试";
        return new AccountResult(code,account,message);
    };

    @GetMapping()
    public AccountResult getall(){
        List<Account> accountList = accountService.getall();
        Integer code = accountList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = accountList!=null ? "" : "查询失败！请重试";
        return new AccountResult(code,accountList,message);
    };


}
