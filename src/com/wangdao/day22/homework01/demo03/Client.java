package com.wangdao.day22.homework01.demo03;

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
        OutputStream out = socket.getOutputStream();
        FileInputStream in = new FileInputStream("a.txt");
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }
        // 禁用此套接字的输出流
        socket.shutdownOutput();
        socket.close();
    }
}
