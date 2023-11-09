package com.wangdao.day21;

import java.io.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(new MyThread());
        FutureTask<String> task1 = new FutureTask<>(new MyThread2());
        FutureTask<String> task2 = new FutureTask<>(new MyThread3());
        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread.start();
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(6000);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"))){
                String str = task.get() + System.lineSeparator()
                        + task1.get() + System.lineSeparator() + task2.get();
                bw.write(str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}

class MyThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        long l1 = System.currentTimeMillis();
        try (FileInputStream fi = new FileInputStream("D:\\Test\\mytemp\\2.0.jpg");
             FileOutputStream fo = new FileOutputStream("c.jpg")) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fi.read(bytes)) != -1) {
                fo.write(bytes, 0, len);
            }
        }
        long l2 = System.currentTimeMillis();
        return Thread.currentThread().getName() + "花费了 " + (l1 - l2) + "毫秒";
    }
}

class MyThread2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        long l1 = System.currentTimeMillis();
        try (FileInputStream fi = new FileInputStream("D:\\Test\\mytemp\\2.0.jpg");
             FileOutputStream fo = new FileOutputStream("d.jpg")) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fi.read(bytes)) != -1) {
                fo.write(bytes, 0, len);
            }
        }
        long l2 = System.currentTimeMillis();
        return Thread.currentThread().getName() + "花费了 " + (l1 - l2) + "毫秒";
    }
}

class MyThread3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        long l1 = System.currentTimeMillis();
        try (FileInputStream fi = new FileInputStream("D:\\Test\\mytemp\\2.0.jpg");
             FileOutputStream fo = new FileOutputStream("e.jpg")) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fi.read(bytes)) != -1) {
                fo.write(bytes, 0, len);
            }
        }
        long l2 = System.currentTimeMillis();
        return Thread.currentThread().getName() + "花费了 " + (l1 - l2) + "毫秒";
    }
}