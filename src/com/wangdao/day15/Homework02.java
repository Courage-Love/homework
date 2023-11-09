package com.wangdao.day15;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        String str = "legendary";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                s += Character.toUpperCase(str.charAt(i));
            } else {
                s += str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
