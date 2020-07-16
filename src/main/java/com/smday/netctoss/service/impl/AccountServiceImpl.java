package com.smday.netctoss.service.impl;

import com.smday.netctoss.mbg.mapper.AccountMapper;
import com.smday.netctoss.mbg.model.Account;
import com.smday.netctoss.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Summerday
 */

@Service
public class AccountServiceImpl implements IAccountService {
    @Resource
    AccountMapper accountMapper;

    @Override
    public Account findById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
