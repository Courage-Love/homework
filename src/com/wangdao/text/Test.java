package com.wangdao.text;

/**
 * @version 1.0
 * @auther cxw
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new A()).start();
        new Thread(new B()).start();
    }
}

class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 52; i++) {
            System.out.println(i);
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println((char)c);
        }
    }
}