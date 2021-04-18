package com.tanben.jobhunting.user.biz;

import com.tanben.jobhunting.bean.Result;
import com.tanben.jobhunting.bean.Resume;
import com.tanben.jobhunting.bean.User;
import com.tanben.jobhunting.dao.EducbackMapper;
import com.tanben.jobhunting.dao.ResumeMapper;
import com.tanben.jobhunting.dao.UserMapper;
import com.tanben.jobhunting.dao.WorkexpMapper;
import com.tanben.jobhunting.user.util.CommonValue;
import com.tanben.jobhunting.user.util.MD5Util;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Date;


@Service
public class UserBiz {

    @Resource
    UserMapper userMapper;
    @Resource
    ResumeMapper resumeMapper;
    @Resource
    WorkexpMapper workexpMapper;
    @Resource
    private EducbackMapper educbackMapper;


    public Result<User> login(String account, String pwd) {
        String pwdmd5 = MD5Util.getMD5String(pwd);
        User loginedUser;
        try {
            loginedUser = userMapper.selectByAccountAndPwd(account, pwdmd5);

        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }
        return loginedUser != null ? Result.getSuccess("登录成功！", loginedUser) : Result.getFailed("账号或密码错误");
    }

    public Result<User> register(String account, String pwd, String email) {

        User user = new User();
        user.setAccount(account);
        try {
            long cnt = userMapper.count(account);
            if (cnt > 0) return Result.getFailed("已有该用户,请直接登录");
            user.setAccount(account);
            user.setPwd(MD5Util.getMD5String(pwd));
            user.setEmail(email);
            user.setTs(new Date());
            user.setDr(0);
            userMapper.insert(user);

            return Result.getSuccess("注册成功！");
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }

    }

    @Cacheable("userInfo#pk_user")
    public Result<User> getUserInfo(Integer pk_user) {
        try {
            User user = userMapper.selectByPrimaryKey(pk_user);
            System.out.println("查询数据库");
            Result<User> res = Result.getSuccess(user);
            return res;
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }
    }

    @Cacheable("resumeInfo#pk_user")
    public Result<Resume> getResumeInfo(Integer pk_user) {
        try {
            Resume resume = resumeMapper.selectByOwner(pk_user);
            return Result.getSuccess(resume);
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }
    }

    @CacheEvict("resumeInfo#pk_user")
    public Result updateResumeInfo(Integer pk_user, String jobdescription, String email, String phone, String address, String introduction) {

        try {
            resumeMapper.updatebBasicInfo(pk_user, jobdescription, email, phone, address,introduction);
            return Result.getSuccess("修改成功");
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }

    }

    @CacheEvict("resumeInfo#pk_user")
    public Result updateWorkExp(Integer pk_workexp, String period, String company, String desc) {

        try {
            workexpMapper.updateWorkExp(pk_workexp,company,period,desc);
            return Result.getSuccess("修改成功");
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }

    }

    @CacheEvict("resumeInfo#pk_user")
    public Result updateEducBack(Integer pk_educback, String period, String school, String desc) {

        try {
            educbackMapper.updateWorkExp(pk_educback,school,period,desc);
            return Result.getSuccess("修改成功");
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }

    }

    @CacheEvict("userInfo#pk_user")
    public Result updateUserInfo(Integer pk_user, User user) {
        user.setPkUser(pk_user);
        try {
            userMapper.updateByPrimaryKeySelective(user);
            return Result.getSuccess("修改成功");
        } catch (Exception e) {
            return Result.getFailed(CommonValue.ERROR_MSG + e.getMessage());
        }

    }
}
