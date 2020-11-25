package com.xu.customer.feign;

import com.xu.customer.bean.Account;
import com.xu.customer.feign.AccountFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountFeignHysteric implements AccountFeign {


    public  String selectAllAccount(Integer id) {
        System.out.println("hysteric error");
        List<Account> list=new ArrayList<Account>();

        return " null";
    }

    @Override
    public  String selectAllAccount2(Integer id) {
        return "失败了。。。。。";
    }
}
