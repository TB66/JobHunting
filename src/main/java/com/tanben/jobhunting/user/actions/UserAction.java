package com.tanben.jobhunting.user.actions;

import com.tanben.jobhunting.bean.Result;
import com.tanben.jobhunting.bean.Resume;
import com.tanben.jobhunting.bean.User;
import com.tanben.jobhunting.user.biz.UserBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@SessionAttributes
@RequestMapping("/user")
public class UserAction {
    @Resource
    UserBiz userBiz;

    @PostMapping("/login")
    public Result<User> login(@RequestBody User user, HttpSession session) {
        Result<User> res = userBiz.login(user.getAccount(), user.getPwd());
        if (res.getCode()==1){
            User loginedUser = res.getData();
            session.setAttribute("loginedUser",loginedUser);
        }
        return res;
    }
    @PostMapping("/register")
    public Result<User> register(@RequestParam String account,@RequestParam String pwd,@RequestParam String email) {
        return userBiz.register(account, pwd, email);
    }

    @PostMapping("/userInfo")
    public Result<User> getUserInfo(@RequestParam Integer pk_user){
        return userBiz.getUserInfo(pk_user);
    }

    @PostMapping("/resumeInfo")
    public Result<Resume> getResumeInfo(@RequestParam Integer pk_user){
        return userBiz.getResumeInfo(pk_user);
    }
}
