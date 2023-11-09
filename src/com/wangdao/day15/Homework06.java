package com.wangdao.day15;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ababa");
        boolean flag = false;
        if (sb.length() % 2 == 0) {
            String str1 = sb.substring(0, sb.length() / 2);
            String str2 = sb.substring(sb.length() / 2);
            StringBuffer stringBuffer = new StringBuffer(str2);
            stringBuffer.reverse();
            String str3 = stringBuffer.toString();
            if (str1.equals(str3)) {
                flag = true;
            }
        } else {
            String str1 = sb.substring(0, sb.length() / 2);
            String str2 = sb.substring(sb.length() / 2 + 1);
            StringBuffer stringBuffer = new StringBuffer(str2);
            stringBuffer.reverse();
            String str3 = stringBuffer.toString();
            if (str1.equals(str3)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("是对称字符~~");
        } else {
            System.out.println("非对称字符");
        }
    }
}
