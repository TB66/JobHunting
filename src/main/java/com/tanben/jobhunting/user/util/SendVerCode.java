package com.tanben.jobhunting.user.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.security.SecureRandom;
import java.util.Random;

public class SendVerCode {
    //生成6位数  验证码
    public static String getCode(){
        String code = "";
        SecureRandom rd= new SecureRandom();
        for (int i = 0; i < 6; i++) {
            int r = rd.nextInt(10); //每次随机出一个数字（0-9）
            code = code + r;  //把每次随机出的数字拼在一起
        }
        System.out.println(code);
        return code;
    }

    //发送					这里的参数为   qq   和验证码
    public static void sendVerCode(String email,String yzm){
        HtmlEmail send = new HtmlEmail();//创建一个HtmlEmail实例对象
        // 获取随机验证码
        String resultCode = yzm;
        try {
            send.setHostName("smtp.qq.com");
            send.setAuthentication("1132315537@qq.com", "xgguuplwvpqtiijg"); //第一个参数是发送者的QQEamil邮箱   第二个参数是刚刚获取的授权码

            send.setFrom("1132315537@qq.com", "招聘网站");//发送人的邮箱为自己的，用户名可以随便填  记得是自己的邮箱不是qq
            send.setSSLOnConnect(true); //开启SSL加密
            send.setCharset("utf-8");
            send.addTo(email);  //设置收件人    email为你要发送给谁的邮箱账户   上方参数
            send.setSubject("验证码"); //邮箱标题
            send.setMsg("您的验证码为   " + resultCode + "   有效期：2分钟"); //Eamil发送的内容
            send.send();  //发送
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SendVerCode.sendVerCode("1132315537@qq.com",SendVerCode.getCode());
    }

}
