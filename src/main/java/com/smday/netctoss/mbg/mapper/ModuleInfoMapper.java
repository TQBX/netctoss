package com.smday.netctoss.mbg.mapper;

import com.smday.netctoss.mbg.model.ModuleInfo;
import com.smday.netctoss.mbg.model.ModuleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleInfoMapper {
    long countByExample(ModuleInfoExample example);

    int deleteByExample(ModuleInfoExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(ModuleInfo record);

    int insertSelective(ModuleInfo record);

    List<ModuleInfo> selectByExample(ModuleInfoExample example);

    ModuleInfo selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") ModuleInfo record, @Param("example") ModuleInfoExample example);

    int updateByExample(@Param("record") ModuleInfo record, @Param("example") ModuleInfoExample example);

    int updateByPrimaryKeySelective(ModuleInfo record);

    int updateByPrimaryKey(ModuleInfo record);
}