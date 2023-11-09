package com.wangdao.day18;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
        String readLine = br.readLine();
        char[] chars = readLine.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '1' && chars[i] <= '9') || (chars[i] >= 'b'
                    && chars[i] <= 'z') || (chars[i] >= 'B' && chars[i] <= 'Z')) {
                chars[i] = (char) (chars[i] - 1);
            } else if (chars[i] == '0') {
                chars[i] = '9';
            } else if (chars[i] == 'a') {
                chars[i] = 'z';
            } else if (chars[i] == 'A') {
                chars[i] = 'Z';
            }
        }
        bw.write(chars);
        bw.flush();
        bw.close();
        br.close();
    }


}
