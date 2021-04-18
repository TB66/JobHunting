package com.tanben.jobhunting.user.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date getTime() throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.parse(dateFormat.format(date));
    }
    public static Date getDate() throws ParseException{
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(dateFormat.format(date));
    }
    //Thu Jan 07 15:16:17 CST 2021
    public static void main(String[] args) throws ParseException {
        System.out.println(getDate());
    }
}
