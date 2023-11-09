package com.wangdao._day19;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("T1线程执行了");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("T2线程执行了");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("T3线程执行了");
            }
        });
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


