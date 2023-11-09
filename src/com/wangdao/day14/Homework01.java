package com.wangdao.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) throws ParseException {
        String bronDate = "1998/02/12";
        long days = CalDays.calDays(bronDate);
        System.out.println("我来到世界 " + days + " 天");
    }
}

class CalDays {

    public static long calDays(String s) throws ParseException {
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date bornDate = simpleDateFormat.parse(s);
        long now = nowDate.getTime();
        long bron = bornDate.getTime();
        return (now - bron) / (24 * 60 * 60 * 1000);
    }
}