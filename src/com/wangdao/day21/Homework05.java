package com.wangdao.day21;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        new Thread(new MyPrintThread(1), "A线程").start();
        new Thread(new MyPrintThread(2), "B线程").start();
        new Thread(new MyPrintThread(3), "C线程").start();
    }

}

class MyPrintThread implements Runnable {
    static int printNum = 0;
    int printId;

    public MyPrintThread(int printId) {
        this.printId = printId;
    }

    @Override
    public void run() {
        synchronized (MyPrintThread.class) {
            while (printNum < 75) {
                if (printNum / 5 % 3 + 1 == printId) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + "----------------" + ++printNum);
                    }
                    MyPrintThread.class.notifyAll();
                } else {
                    try {
                        MyPrintThread.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
