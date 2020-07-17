package com.smday.netctoss.service.impl;

import com.smday.netctoss.mbg.mapper.AdminInfoMapper;
import com.smday.netctoss.mbg.model.AdminInfo;
import com.smday.netctoss.mbg.model.AdminInfoExample;
import com.smday.netctoss.service.IAdminInfoService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Summerday
 */

@Service
public class AdminInfoServiceImpl implements IAdminInfoService {

    @Resource
    AdminInfoMapper adminInfoMapper;

    @Override
    public AdminInfo selectAdminByAdminCode(String adminCode) {

        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria().andAdminCodeEqualTo(adminCode);

        List<AdminInfo> adminInfos = adminInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(adminInfos)) {
            return null;
        }
        return adminInfos.get(0);
    }
}
