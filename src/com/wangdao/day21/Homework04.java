package com.wangdao.day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());
        pool.submit(new MyTask());

        pool.shutdown();
    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        int time = (int) (Math.random() * 11);
        try {
            Thread.sleep(time * 1000);
            System.out.println(Thread.currentThread().getName() + "睡眠了" + time + "秒");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
