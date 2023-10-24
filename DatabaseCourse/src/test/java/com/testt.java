package com;

import com.config.SpringConfig;
import com.domain.Account;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class testt {
    @Autowired
    private AccountService accountService;

    @Test
    public void testgetbyID(){
        String versionSpring = SpringVersion.getVersion();


        System.out.println("Spring Version：" + versionSpring);


    }
}