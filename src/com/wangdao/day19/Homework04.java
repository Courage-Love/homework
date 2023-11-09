package com.wangdao.day19;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Stack;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CrackPassword());
        Thread t2 = new Thread(new LogThread());
        t2.setDaemon(true);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        while (LogThread.flag) {

        }
    }

    public static String getPassword() {
        String strPwd = "";
        String str = "0123456789";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            strPwd += str.charAt(random.nextInt(10));
        }
        return strPwd;
    }
}

class CrackPassword implements Runnable {

    private static String[] strings;
    private static int index;
    private static String temp;

    @Override
    public void run() {
        strings = new String[1000];
        String password = Homework04.getPassword();
        String[] model = new String[1000];
        for (int i = 0; i < 1000; i++) {
            if (i < 9) {
                model[i] = "00" + (i+1);
            } else if (i < 99) {
                model[i] = "0" + (i + 1);
            } else {
                model[i] = String.valueOf(i + 1);
            }
        }
        for (String s : model) {
            if (!s.equals(password)) {
                strings[index++] = s;
            } else {
                temp = s;
                break;
            }
        }
        System.out.println(temp);
    }

    public static String[] getStrings() {
        return strings;
    }

    public static void setStrings(String[] strings) {
        CrackPassword.strings = strings;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        CrackPassword.index = index;
    }

    public static String getTemp() {
        return temp;
    }

    public static void setTemp(String temp) {
        CrackPassword.temp = temp;
    }
}

class LogThread implements Runnable {

    static boolean flag = true;

    @Override
    public void run() {
        String[] strings = CrackPassword.getStrings();
        int index = CrackPassword.getIndex();
        String temp = CrackPassword.getTemp();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"))) {
            for (int i = 0; i < index; i++) {
                bw.write(strings[i]);
                bw.newLine();
            }
            bw.write("密码是：" + temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        flag = false;
    }
}