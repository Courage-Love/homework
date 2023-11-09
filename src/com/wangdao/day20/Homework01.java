package com.wangdao.day20;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        DownLoad downLoad = new DownLoad();
        new Thread(downLoad, "A").start();
        new Thread(downLoad, "B").start();
        new Thread(downLoad, "C").start();
    }
}

class DownLoad implements Runnable {

    private int num = 100;

    private static final Object OBJECT = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (OBJECT) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "------------------还需要下载 " + (--num) + " M");
                } else {
                    break;
                }
            }
        }
    }
}
