package com.wangdao.day18;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\WD_Java_code\\homework\\src\\com\\wangdao\\day18\\Homework04.java"));
        String readLine = null;
        int countChar= 0;
        int countSpace = 0;
        int countNum = 0;
        while ((readLine = br.readLine()) != null) {
            for (int i = 0; i < readLine.length(); i++) {
                char c = readLine.charAt(i);
                if (Character.isLetter(c)) {
                    countChar++;
                } else if (Character.isDigit(c)) {
                    countNum++;
                } else if (Character.isWhitespace(c)) {
                    countSpace++;
                }
            }
        }
        System.out.println("英文字母个数是：" + countChar);
        System.out.println("数字字符个数是：" + countNum);
        System.out.println("空格个数是：" + countSpace);

    }
}
