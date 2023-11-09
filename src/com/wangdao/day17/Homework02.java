package com.wangdao.day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        try (FileOutputStream out = new FileOutputStream("a.txt", true)){
            while (true) {
                System.out.println("请输入一个字符串(输入end结束)：");
                str = scanner.next();
                if (str != null && str.equals("end")) {
                    break;
                }
                out.write(str.getBytes());
                out.write(System.lineSeparator().getBytes());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
