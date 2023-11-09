package com.wangdao.day22.homework01.demo03;

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
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readCount = 0;
        FileOutputStream out = null;
        try {
             out = new FileOutputStream("D:\\a.txt");
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }
        socket.close();
    }
}
