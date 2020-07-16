package com.smday.netctoss.mbg.mapper;

import com.smday.netctoss.mbg.model.ServiceUpdateBak;
import com.smday.netctoss.mbg.model.ServiceUpdateBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceUpdateBakMapper {
    long countByExample(ServiceUpdateBakExample example);

    int deleteByExample(ServiceUpdateBakExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceUpdateBak record);

    int insertSelective(ServiceUpdateBak record);

    List<ServiceUpdateBak> selectByExample(ServiceUpdateBakExample example);

    ServiceUpdateBak selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceUpdateBak record, @Param("example") ServiceUpdateBakExample example);

    int updateByExample(@Param("record") ServiceUpdateBak record, @Param("example") ServiceUpdateBakExample example);

    int updateByPrimaryKeySelective(ServiceUpdateBak record);

    int updateByPrimaryKey(ServiceUpdateBak record);
}