package com.wangdao._day19;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    private static int index;
    private static String[] strings = new String[1000];
    public static void main(String[] args) {
        String password = getPassword();

        System.out.println("密码为：" + password);
        Thread t1 = new Thread(() -> matchPassword(password));
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t2 = new Thread(() -> {
            try (FileWriter fw = new FileWriter("b.txt")) {
                for (int i = 0; i < index; i++) {
                    fw.write(strings[i]);
                    fw.write(System.lineSeparator());
                }
                fw.write("密码为：" + password);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        t2.setDaemon(true);
        t2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void matchPassword(String password) {
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str = String.format("%03d", i);
            if (str.equals(password)) {
                index = i;
            } else {
                strings[i] = str;
            }
        }

    }

    private static String getPassword() {
        String str = "";
        for (int i = 0; i < 3; i++) {
            str += (int) (Math.random() * 10);
        }
        return str;
    }
}


