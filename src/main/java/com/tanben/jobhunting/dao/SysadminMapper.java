package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Sysadmin;
import com.tanben.jobhunting.bean.SysadminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysadminMapper {
    long countByExample(SysadminExample example);

    int deleteByExample(SysadminExample example);

    int deleteByPrimaryKey(Integer pkAdmin);

    int insert(Sysadmin record);

    int insertSelective(Sysadmin record);

    List<Sysadmin> selectByExample(SysadminExample example);

    Sysadmin selectByPrimaryKey(Integer pkAdmin);

    int updateByExampleSelective(@Param("record") Sysadmin record, @Param("example") SysadminExample example);

    int updateByExample(@Param("record") Sysadmin record, @Param("example") SysadminExample example);

    int updateByPrimaryKeySelective(Sysadmin record);

    int updateByPrimaryKey(Sysadmin record);
}