package com.smday.netctoss.service.impl;

import com.smday.netctoss.mbg.mapper.AdminInfoMapper;
import com.smday.netctoss.mbg.model.AdminInfo;
import com.smday.netctoss.mbg.model.AdminInfoExample;
import com.smday.netctoss.service.IAdminInfoService;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
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
    public AdminInfo login(AdminInfo info) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria().andAdminCodeEqualTo(info.getAdminCode())
                .andPasswordEqualTo(info.getPassword());
        List<AdminInfo> adminInfos = adminInfoMapper.selectByExample(example);

        if(CollectionUtils.isEmpty(adminInfos)){
            return null;
        }
        return adminInfos.get(0);

    }
}
