package com.smday.netctoss.service;

import com.smday.netctoss.mbg.model.Account;

/**
 * @author Summerday
 */
public interface IAccountService {

    Account findById(Integer id);

    Account findByIdCardNo(String idCard);

}
