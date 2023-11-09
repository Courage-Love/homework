package com.wangdao.day16;

import java.io.File;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        File rootPath = new File("D:\\Test - 副本");
        deleteFile(rootPath);
//        System.out.println(rootPath.delete());
    }

    private static void deleteFile(File rootPath) {
        File[] files = rootPath.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteFile(file);
            }
        }
        rootPath.delete();
        System.out.println("删除完成~~");
    }
}
