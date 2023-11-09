package com.wangdao.day16;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\file");
        System.out.println(file.mkdir());
        for (int i = 0; i < 10; i++) {
            File file1 = new File("D:\\file\\i\\0\\2" + i + ".txt");
            System.out.println(file1.createNewFile());
        }
        for (int i = 0; i < 3; i++) {
            File file1 = new File("D:\\file\\" + i);
            System.out.println(file1.mkdirs());
        }
        for (int i = 0; i < 2; i++) {
            File file1 = new File("D:\\file\\i\\" + i);
            System.out.println(file1.mkdirs());
        }
        for (int i = 0; i < 1; i++) {
            File file1 = new File("D:\\file\\i\\0" + i);
            System.out.println(file1.mkdirs());
        }
        File file1 = new File("D:\\file\\i\\0\\2");
        System.out.println(file1.mkdir());
    }
}
