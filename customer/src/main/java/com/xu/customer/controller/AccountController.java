package com.xu.customer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xu.customer.bean.Account;
import com.xu.customer.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Controller
//@DefaultProperties(defaultFallback = "selectAllAccount2")
public class AccountController {

    @Resource
    private AccountFeign accountFeign;
    /*@HystrixCommand(fallbackMethod="globalFallBack")*/
//    @HystrixCommand
    @ResponseBody
    @RequestMapping(value = "/selectAllAccount/{id}")
    public String selectAllAccount(@PathVariable("id") Integer id){
        //int i=1/0;
       String accounts=accountFeign.selectAllAccount(id);
        return accounts;
    }

 /*   public List<Account> selectAllAccount2(Integer id){
        List<Account> accounts=new ArrayList<Account>();
        return accounts;
    }*/

    public List<Account> selectAllAccount2(){
        List<Account> accounts=new ArrayList<Account>();
        System.out.println("1111111111111");
        return accounts;
    }


    public String globalFallBack(){
        return "global异常信息";
    }
    @ResponseBody
    @GetMapping(value = "/selectAllAccount2/{id}")
    public String selectAllAccount2(@PathVariable("id") Integer id){
        return accountFeign.selectAllAccount2(id);
    }
}
