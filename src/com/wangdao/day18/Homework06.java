package com.wangdao.day18;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework06 {
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\Test\\mytemp");
        findFile(file);

    }

    private static void findFile(File rootPath) throws IOException {
        File[] files = rootPath.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")){
                copyFile(file);
            } else {
                findFile(file);
            }
        }
    }

    private static void copyFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Test\\copy\\" + file.getName()));
        String readLine = null;
        while ((readLine = br.readLine()) != null) {
            bw.write(readLine);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
