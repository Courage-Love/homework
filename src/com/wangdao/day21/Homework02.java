package com.wangdao.day21;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTime(), 3000, 5000);

        try {
            TimeUnit.SECONDS.sleep(60);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            timer.cancel();
        }
    }
}

class MyTime extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String dateAndTime = format.format(date);
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt", true)))) {
            bw.write(dateAndTime);
            bw.newLine();
            System.out.println("写入了 " + dateAndTime);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}