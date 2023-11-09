package com.wangdao.day22.homework01.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        Scanner scanner = new Scanner(System.in);
        String content = scanner.next();
        OutputStream out = socket.getOutputStream();
        out.write(content.getBytes());
        socket.close();
    }
}
