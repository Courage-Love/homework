package com.wangdao.day22.homework01.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @version 1.0
 * @auther cxw
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        FileInputStream in = new FileInputStream("a.txt");
        OutputStream out = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }
        in.close();
        socket.close();
    }
}
