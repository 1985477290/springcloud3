package com.xu.producer.dao;

import com.xu.producer.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountDao {
    List<Account> selectAllAccount();
}
