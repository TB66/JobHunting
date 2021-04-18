package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Educback;
import com.tanben.jobhunting.bean.EducbackExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EducbackMapper {
    long countByExample(EducbackExample example);

    int deleteByExample(EducbackExample example);

    int deleteByPrimaryKey(Integer pkEducback);

    int insert(Educback record);

    int insertSelective(Educback record);

    List<Educback> selectByExample(EducbackExample example);

    Educback selectByPrimaryKey(Integer pkEducback);

    int updateByExampleSelective(@Param("record") Educback record, @Param("example") EducbackExample example);

    int updateByExample(@Param("record") Educback record, @Param("example") EducbackExample example);

    int updateByPrimaryKeySelective(Educback record);

    int updateByPrimaryKey(Educback record);
    @Select(" select * from educback where pk_resume = #{pk_resume} and dr = 0 ")
    List<Educback> selectByResumeKey(@Param("pk_resume") Integer pk_resume);

    @Update(" update educback\n" +
            "      period = #{period,jdbcType=VARCHAR},\n" +
            "      school = #{school,jdbcType=VARCHAR},\n" +
            "      desc = #{desc,jdbcType=VARCHAR},\n" +
            "      changetime = DATE_FORMAT(NOW(),'%Y-%m-%d %H:%m:%s')  \n" +
            "    where pk_workexp = #{pk_workexp,jdbcType=INTEGER}")
    int updateWorkExp(@Param("pk_educback") Integer pk_educback,
                      @Param("school") String school,
                      @Param("period") String period,
                      @Param("desc") String desc);
}