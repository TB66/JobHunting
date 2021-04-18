package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Jobposition;
import com.tanben.jobhunting.bean.JobpositionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobpositionMapper {
    long countByExample(JobpositionExample example);

    int deleteByExample(JobpositionExample example);

    int deleteByPrimaryKey(Integer pkJobposition);

    int insert(Jobposition record);

    int insertSelective(Jobposition record);

    List<Jobposition> selectByExample(JobpositionExample example);

    Jobposition selectByPrimaryKey(Integer pkJobposition);

    int updateByExampleSelective(@Param("record") Jobposition record, @Param("example") JobpositionExample example);

    int updateByExample(@Param("record") Jobposition record, @Param("example") JobpositionExample example);

    int updateByPrimaryKeySelective(Jobposition record);

    int updateByPrimaryKey(Jobposition record);
}