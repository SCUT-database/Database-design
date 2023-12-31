package com.controller;

import com.dao.AccountDao;
import com.domain.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("accountcontroller")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping()
    public Result save(@RequestBody Account account){
        boolean flag = accountService.save(account);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @PutMapping()
    public Result update(@RequestBody Account account){
        boolean flag = accountService.update(account);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = accountService.delete(id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getbyID(@PathVariable String id){
        Account account = accountService.getbyID(id);
        Integer code = account!=null ? Code.GET_OK : Code.GET_ERR;
        String message = account!=null ? "" : "查询失败！请重试";
        return new Result(code,account,message);
    }

    @GetMapping()
    public Result getall(){
        List<Account> accountList = accountService.getall();
        Integer code = accountList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = accountList!=null ? "" : "查询失败！请重试";
        return new Result(code,accountList,message);
    }

}