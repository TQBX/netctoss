package com.smday.netctoss.service;

import com.smday.netctoss.mbg.model.Cost;

/**
 * @author Summerday
 */
public interface ICostService {

    int insert(Cost cost);

    Cost findById(Integer id);
}
