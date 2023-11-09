package com.wangdao.day15;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String s = "java";
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(s, index)) != -1) {
            count++;
            index += s.length();
        }
        System.out.println(count);
    }
}
