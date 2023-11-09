package com.wangdao.day19;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        CopyFile2 c1 = new CopyFile2(new File("D:\\JAVA\\JavaDetail\\王道Java笔记\\视频\\day3_method\\java55th_day3_2_method.mp4"),
                new File("D:\\java55th_day3_2_method.mp4"));
        CopyFile2 c2 = new CopyFile2(new File("D:\\JAVA\\JavaDetail\\王道Java笔记\\视频\\day3_method\\java55th_day3_1_控制关键字.mp4"),
                new File("D:\\java55th_day3_1_控制关键字.mp4"));
        CopyFile2 c3 = new CopyFile2(new File("D:\\JAVA\\JavaDetail\\王道Java笔记\\视频\\day4_array\\java54th_day4_3_JVM运行时数据区.mp4"),
                new File("D:\\java54th_day4_3_JVM运行时数据区.mp4"));
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
    }
}

class CopyFile2 implements Runnable {

    File file1;
    File file2;


    @Override
    public void run() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(file1);
            out = new FileOutputStream(file2);
            byte[] bytes = new byte[1024];
            double count = 0;
            int len = 0;
            DecimalFormat df = new DecimalFormat("0.00");
            while ((len = in.read(bytes)) != -1) {
                count += len;
                out.write(bytes, 0, len);
                System.out.println(file1.getName() + "文件已复制" + String.format("%.5f", (count / file1.length()) * 100) + "%");
                Thread.sleep(500);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public CopyFile2(File file1, File file2) {
        this.file1 = file1;
        this.file2 = file2;
    }
}
