package com.wangdao.day18;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("a.txt"));
        int count1 = 0;
        int count2 = 0;
        int readCount = 0;
        while ((readCount = bi.read()) != -1) {
            if ((readCount - '0') % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        String s1 = "偶数个数: " + count1 + "个";
        String s2 = "奇数个数: " + count2 + "个";
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("a.txt", true));
        bo.write(System.lineSeparator().getBytes());
        bo.write(s1.getBytes());
        bo.write(System.lineSeparator().getBytes());
        bo.write(s2.getBytes());
        bo.close();
        bi.close();
    }
}
