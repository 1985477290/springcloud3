package com.xu.producer.controller;

import ch.qos.logback.core.util.TimeUtil;
import com.xu.producer.bean.Account;
import com.xu.producer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @ResponseBody
    @GetMapping(value = "/selectAllAccount/{id}")
    public  String selectAllAccount2(@PathVariable(value = "id") Integer id){

       List<Account> list= accountService.selectAllAccount();
        for (Account account:list
             ) {
            System.out.println(account);

        }

        System.out.println(id);
        return list.toString();
    }

    @ResponseBody
    @RequestMapping("/selectAllAccount")
    public String selectAllAccount(Integer id){

        List<Account> list= accountService.selectAllAccount();
        for (Account account:list
        ) {
            System.out.println(account);

        }

        System.out.println(id);
        return list.toString();
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        return "端口：9997";
    }


}
