package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Comadmin;
import com.tanben.jobhunting.bean.ComadminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComadminMapper {
    long countByExample(ComadminExample example);

    int deleteByExample(ComadminExample example);

    int deleteByPrimaryKey(Integer pkAdmin);

    int insert(Comadmin record);

    int insertSelective(Comadmin record);

    List<Comadmin> selectByExample(ComadminExample example);

    Comadmin selectByPrimaryKey(Integer pkAdmin);

    int updateByExampleSelective(@Param("record") Comadmin record, @Param("example") ComadminExample example);

    int updateByExample(@Param("record") Comadmin record, @Param("example") ComadminExample example);

    int updateByPrimaryKeySelective(Comadmin record);

    int updateByPrimaryKey(Comadmin record);
}