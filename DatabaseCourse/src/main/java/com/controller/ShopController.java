package com.controller;

import com.domain.Account;
import com.domain.Shop;
import com.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("shopcontroller")
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopservice;

    @PostMapping()
    public Result save(@RequestBody Shop shop){
        boolean flag = shopservice.save(shop);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @GetMapping("/{name}")
    public Result getbyID(@PathVariable String name){
        Shop shop = shopservice.getbyID(name);
        Integer code = shop!=null ? Code.GET_OK : Code.GET_ERR;
        String message = shop!=null ? "" : "查询失败！请重试";
        return new Result(code,shop,message);
    }

    @GetMapping()
    public Result getall(){
        List<Shop> shopList = shopservice.getall();
        Integer code = shopList!=null ? Code.GET_OK : Code.GET_ERR;
        String message = shopList!=null ? "" : "查询失败！请重试";
        return new Result(code,shopList,message);
    }
}
