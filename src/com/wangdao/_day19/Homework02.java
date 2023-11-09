package com.wangdao._day19;

import java.io.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        CopyFile copyFile1 = new CopyFile(new File("D:\\Test\\mytemp\\aa.txt"), new File("D:\\aa.txt"));
        CopyFile copyFile2 = new CopyFile(new File("D:\\Test\\mytemp\\a.txt"), new File("D:\\a.txt"));
        CopyFile copyFile3 = new CopyFile(new File("D:\\Test\\mytemp\\okok.txt"), new File("D:\\okok.txt"));
        copyFile1.start();
        copyFile2.start();
        copyFile3.start();
    }
}

class CopyFile extends Thread {

    private File file1;
    private File file2;

    @Override
    public void run() {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(file1));
            bo = new BufferedOutputStream(new FileOutputStream(file2));
            byte[] bytes = new byte[1024];
            int len = 0;
            double count = 0;
            double rate = 0;
            while ((len = bi.read(bytes)) != -1) {
                bo.write(bytes, 0, len);
                count += len;
                rate = count / file1.length() * 100;
                System.out.println(file1.getName() + "文件已复制" + String.format("%.4f", rate) + "%");
                Thread.sleep(500);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bi != null) {
                    bi.close();
                }
                if (bo != null) {
                    bo.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public CopyFile(File file1, File file2) {
        this.file1 = file1;
        this.file2 = file2;
    }
}

