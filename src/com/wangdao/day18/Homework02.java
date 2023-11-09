package com.wangdao.day18;

import com.sun.corba.se.impl.encoding.CodeSetConversion;

import java.io.*;
import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
//        inputAndOutputStreamMethod();

        readAndWriterMethod();
    }

    private static void readAndWriterMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
        char[] chars = new char[1024];
        int readCount = br.read(chars);
        char temp = 0;
        for (int i = 1; i < readCount; i++) {
            temp = chars[i];
            int index = i - 1;
            while (index >= 0 && chars[index] > temp) {
                chars[index + 1] = chars[index];
                index--;
            }
            if (index + 1 != i) {
                chars[index + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(readCount);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt", true)));
        bw.newLine();
        bw.write(chars, 0, readCount);
        bw.flush();
        bw.close();
        br.close();
    }


    public static void inputAndOutputStreamMethod() throws IOException{
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("b.txt"));
        byte[] bytes = new byte[1024];
        int readCount = bi.read(bytes);
        byte temp = 0;
        for (int i = 1; i < readCount; i++) {
            temp = bytes[i];
            int index = i - 1;
            while (index >= 0 && bytes[index] > temp) {
                bytes[index + 1] = bytes[index];
                index--;
            }
            if (index + 1 != i) {
                bytes[index + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(bytes));
        System.out.println(readCount);
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("b.txt", true));
        bo.write(System.lineSeparator().getBytes());
        bo.write(bytes, 0, readCount);
        bo.close();
        bi.close();
    }
}
