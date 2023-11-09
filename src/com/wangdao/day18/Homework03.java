package com.wangdao.day18;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        String readLine = null;
        while ((readLine = br.readLine()) != null) {
            System.out.println(readLine);
            readLine = (new StringBuffer(readLine)).reverse().toString();
            bw.write(readLine);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
