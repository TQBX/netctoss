package com.smday.netctoss.service.impl;

import com.smday.netctoss.mbg.mapper.AccountMapper;
import com.smday.netctoss.mbg.model.Account;
import com.smday.netctoss.mbg.model.AccountExample;
import com.smday.netctoss.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public Account findByIdCardNo(String idCard) {

        AccountExample example = new AccountExample();
        example.createCriteria().andIdcardNoEqualTo(idCard);
        List<Account> accounts = accountMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(accounts)){
            return null;
        }
        return accounts.get(0);
    }
}
