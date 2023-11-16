//package com.controller;
//
//import com.domain.Account;
//import com.domain.addANDemail;
//import com.service.addANDemailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController("aAecontroller")
//@RequestMapping("/aAe")
//public class addANDemailDaoController {
//    @Autowired
//    private addANDemailService aAsService;
//
//    @PostMapping()
//    public addANDemailDaoResult save(@RequestBody addANDemail aAd){
//        boolean flag = aAsService.save(aAd);
//        return new addANDemailDaoResult(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
//    }
//
//    @GetMapping()
//    public addANDemailDaoResult getall(){
//        List<addANDemail> aDeList = aAsService.getall();
//        Integer code = aDeList!=null ? Code.GET_OK : Code.GET_ERR;
//        String message = aDeList!=null ? "" : "查询失败！请重试";
//        return new addANDemailDaoResult(code,aDeList,message);
//    }
//
//
//}
