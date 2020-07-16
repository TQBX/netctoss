package com.smday.netctoss.service.impl;

import com.smday.netctoss.mbg.mapper.CostMapper;
import com.smday.netctoss.mbg.model.Cost;
import com.smday.netctoss.service.ICostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Summerday
 */

@Service
public class CostServiceImpl implements ICostService {

    @Resource
    private CostMapper costMapper;

    @Override
    public int insert(Cost cost) {
        return costMapper.insert(cost);
    }

    @Override
    public Cost findById(Integer id){
        return costMapper.selectByPrimaryKey(id);
    }
}
