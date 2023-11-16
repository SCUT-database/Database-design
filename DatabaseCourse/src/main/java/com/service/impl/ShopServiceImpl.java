package com.service.impl;

import com.dao.ShopDao;
import com.domain.Account;
import com.domain.Shop;
import com.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    public boolean save(Shop shop){
        return shopDao.save(shop) > 0;
    }
    public Shop getbyID(String name){
        return shopDao.getbyID(name);
    }
    public List<Shop> getall(){
        return shopDao.getall();
    }
}
