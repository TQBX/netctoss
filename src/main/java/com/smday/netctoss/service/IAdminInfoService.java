package com.smday.netctoss.service;

import com.smday.netctoss.mbg.model.AdminInfo;

/**
 * @author Summerday
 */
public interface IAdminInfoService {


    AdminInfo selectAdminByAdminCode(String adminCode);
}
