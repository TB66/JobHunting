package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Workexp;
import com.tanben.jobhunting.bean.WorkexpExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WorkexpMapper {
    long countByExample(WorkexpExample example);

    int deleteByExample(WorkexpExample example);

    int deleteByPrimaryKey(Integer pkWorkexp);

    int insert(Workexp record);

    int insertSelective(Workexp record);

    List<Workexp> selectByExample(WorkexpExample example);

    Workexp selectByPrimaryKey(Integer pkWorkexp);

    int updateByExampleSelective(@Param("record") Workexp record, @Param("example") WorkexpExample example);

    int updateByExample(@Param("record") Workexp record, @Param("example") WorkexpExample example);

    int updateByPrimaryKeySelective(Workexp record);

    int updateByPrimaryKey(Workexp record);

    @Select(" select * from workexp where pk_resume = #{pk_resume} and dr = 0 ")
    List<Workexp> selectByResumeKey(@Param("pk_resume") Integer pk_resume);

    @Update(" update workexp\n" +
            "      period = #{period,jdbcType=VARCHAR},\n" +
            "      company = #{company,jdbcType=VARCHAR},\n" +
            "      desc = #{desc,jdbcType=VARCHAR},\n" +
            "      changetime = DATE_FORMAT(NOW(),'%Y-%m-%d %H:%m:%s')  \n" +
            "    where pk_workexp = #{pk_workexp,jdbcType=INTEGER}")
    int updateWorkExp(@Param("pk_workexp")Integer pk_workexp,
                      @Param("company")String company,
                      @Param("period")String period,
                      @Param("desc")String desc);
}