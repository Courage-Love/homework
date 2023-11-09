package com.wangdao.day18;

import java.io.*;
import java.util.Calendar;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        char[] chars = br.readLine().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '0' && chars[i] <= '8') || (chars[i] >= 'a'
                    && chars[i] <= 'y') || (chars[i] >= 'A' && chars[i] <= 'Y')) {
                chars[i] = (char) (chars[i] + 1);
            } else if (chars[i] == '9') {
                chars[i] = '0';
            } else if (chars[i] == 'z') {
                chars[i] = 'a';
            } else if (chars[i] == 'Z') {
                chars[i] = 'A';
            }
        }
        bw.write(chars);
        bw.flush();
        bw.close();
        br.close();
    }
}
