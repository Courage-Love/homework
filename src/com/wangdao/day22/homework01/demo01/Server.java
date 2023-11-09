package com.wangdao.day22.homework01.demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @auther cxw
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readCount = inputStream.read(bytes);
        try (BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:\\copy.txt"));){
            bo.write(bytes, 0, readCount);
        }
        socket.close();
    }
}
