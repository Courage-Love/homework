package com.wangdao.day15;

import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 3; i++) {
            str += (int)(Math.random()*10);
        }
        for (int i = 0; i < 1000; i++) {
//            if (i == 0 && "000".equals(str)) {
//                System.out.println("破解成功，密码为：" + str);
//                return;
//            } else if (i >= 1 && i <= 9 && ("00" + i).equals(str)) {
//                System.out.println("破解成功，密码为：" + str);
//                return;
//            } else if (i >= 10 && i <= 99 && ("0" + i).equals(str)) {
//                System.out.println("破解成功，密码为：" + str);
//                return;
//            } else if (String.valueOf(i).equals(str)) {
//                System.out.println("破解成功，密码为：" + str);
//                return;
//            }
            String format = String.format("%03d", i);
            if (format.equals(str)) {
                System.out.println(str);
                return;
            }
        }
    }
}