package com.wangdao.day21;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    static String str = "1A2B3C4D5E6F7G";
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (OBJECT) {
                for (int i = 0; i < str.length(); i += 2) {
                    OBJECT.notify();
                    System.out.println(Thread.currentThread().getName() + "---------" + str.charAt(i));
                    try {
                        OBJECT.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                OBJECT.notify();
            }
        }, "A线程").start();
        new Thread(() -> {
            synchronized (OBJECT) {

                for (int i = 1; i < str.length(); i += 2) {
                    OBJECT.notify();
                    System.out.println(Thread.currentThread().getName() + "---------" + str.charAt(i));
                    try {
                        OBJECT.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                OBJECT.notify();
            }
        }, "B线程").start();
    }
}
