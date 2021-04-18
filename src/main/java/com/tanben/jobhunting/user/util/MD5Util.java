package com.tanben.jobhunting.user.util;

import org.springframework.util.DigestUtils;

public class MD5Util {

    public static String getMD5String(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
}