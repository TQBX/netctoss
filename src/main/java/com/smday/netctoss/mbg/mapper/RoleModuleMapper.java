package com.smday.netctoss.mbg.mapper;

import com.smday.netctoss.mbg.model.RoleModule;
import com.smday.netctoss.mbg.model.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
    long countByExample(RoleModuleExample example);

    int deleteByExample(RoleModuleExample example);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    List<RoleModule> selectByExample(RoleModuleExample example);

    int updateByExampleSelective(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByExample(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);
}