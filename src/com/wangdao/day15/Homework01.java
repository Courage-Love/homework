package com.wangdao.day15;

import java.util.concurrent.CountDownLatch;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = "peter piper picked a peck of pickled peppers";
        int count = 0;
        String[] split = str.split(" ");
        for (String s : split) {
            if (s.startsWith("p")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
