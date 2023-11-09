package com.wangdao.day16;

import java.io.File;
import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework06 {
    public static void main(String[] args) {
        File rootPath = new File("D:\\Test\\mytemp");
        listFiles(rootPath);
    }

    private static void listFiles(File rootPath) {
        File[] files = rootPath.listFiles(s -> s.isDirectory() && s.getName().contains("a"));
        System.out.println(Arrays.toString(files));

        File[] files1 = rootPath.listFiles(s -> s.isFile() && s.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(files1));

        File[] files2 = rootPath.listFiles(s -> s.isFile() && s.getName().startsWith("a"));
        System.out.println(Arrays.toString(files2));

    }
}
