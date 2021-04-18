package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.Resume;
import com.tanben.jobhunting.bean.ResumeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ResumeMapper {
    long countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(Integer pkResume);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeExample example);

    Resume selectByPrimaryKey(Integer pkResume);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);

    @Select("select * from resume where owner = #{owner} and dr = 0 limit 1")
    Resume selectByOwner(@Param("owner") Integer owner);

    @Update("update resume set \n" +
            "      jobdescription = #{jobdescription,jdbcType=VARCHAR},\n" +
            "      email = #{email,jdbcType=VARCHAR},\n" +
            "      address = #{address,jdbcType=VARCHAR},\n" +
            "      phone = #{phone,jdbcType=VARCHAR},\n" +
            "      introduction = #{introduction,jdbcType=VARCHAR} \n" +
            "      changetime = DATE_FORMAT(NOW(),'%Y-%m-%d %H:%m:%s')  \n" +
            "      where pk_resume = #{pk_resume,jdbcType=INTEGER} ")
    int updatebBasicInfo(@Param("pk_resume") Integer pk_resume,
                         @Param("jobdescription") String jobdescription,
                         @Param("email") String email,
                         @Param("phone") String phone,
                         @Param("address") String address,
                         @Param("introduction") String introduction);

}