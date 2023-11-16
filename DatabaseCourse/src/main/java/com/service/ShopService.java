package com.service;


import com.domain.Shop;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ShopService {
    //要返回服务端是否成功
    public boolean save(Shop shop);
    public List<Shop> getall();
    public Shop getbyID(String name);
}
