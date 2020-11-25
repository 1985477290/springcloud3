package com.xu.producer.service.impl;

import com.xu.producer.bean.Account;
import com.xu.producer.dao.AccountDao;
import com.xu.producer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> selectAllAccount() {
        return accountDao.selectAllAccount();
    }
}
