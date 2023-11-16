package com.service;

import com.domain.Account;
import com.domain.addANDemail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Transactional
public interface addANDemailService {
    public boolean save(addANDemail aAd);
    public List<addANDemail> getall();
}
