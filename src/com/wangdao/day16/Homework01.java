package com.wangdao.day16;

import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        String[] strings = new String[100];
        for (int i = 0; i < 100; i++) {
            strings[i] = getRandomStr(2);
        }

        int sum = 0;
        for (int i = 0; i < 99; i++) {
            if (strings[i] == null) {
                continue;
            }
            boolean flag = false;
            int count = 0;
            for (int j = i + 1; j < 100; j++) {
                if (strings[j] != null && strings[i].equals(strings[j])) {
                    count++;
                    strings[j] = null; // 找到一个重复的字符串就置空
                }
            }
            if (count > 0) {
                System.out.println(strings[i] + "重复了 " + count + " 次");
                sum++;
            }
        }
        System.out.println("重复的字符串有：" + sum + " 种");
    }

    public static String getRandomStr(int length) {
        String str = "";
        for (int i = '0'; i <= '9'; i++) {
            str += ((char) i);
        }
        for (int i = 'a'; i <= 'z'; i++) {
            str += ((char) i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            str += ((char) i);
        }
        int index  = 0;
        Random random = new Random();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            index = random.nextInt(str.length());
            chars[i] = str.charAt(index);
        }
        return new String(chars);
    }
}
