package com.wangdao.day22.homework01.demo02;

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
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(new String(bytes, 0, readCount));
    }
}
