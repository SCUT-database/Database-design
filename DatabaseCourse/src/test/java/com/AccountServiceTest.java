package com;

import com.config.SpringConfig;
import com.domain.Account;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testgetbyID(){
        Account account = accountService.getbyID("lxjfyc");
        System.out.println(account.getId());
        System.out.println(account.getPassword());
    }
}
