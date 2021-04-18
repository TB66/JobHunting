package com.tanben.jobhunting.dao;

import com.tanben.jobhunting.bean.User;
import com.tanben.jobhunting.bean.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer pkUser);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer pkUser);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user where account=#{account} and pwd=#{pwd} and dr = 0")
    User selectByAccountAndPwd(@Param("account") String account, @Param("pwd") String pwd);

    @Select("SELECT\n" +
            "	count( account ) AS num \n" +
            "FROM\n" +
            "USER \n" +
            "WHERE\n" +
            "	account = #{account} and dr = 0")
    int count(String account);
}