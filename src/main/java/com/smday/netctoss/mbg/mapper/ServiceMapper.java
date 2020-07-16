package com.smday.netctoss.mbg.mapper;

import com.smday.netctoss.mbg.model.Service;
import com.smday.netctoss.mbg.model.ServiceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ServiceMapper {
    long countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(Integer serviceId);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(Integer serviceId);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);


}