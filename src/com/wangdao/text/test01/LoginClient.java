package com.wangdao.text.test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String password = scanner.next();
        User user = new User(id, password);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(new String(bytes, 0, readCount));
        socket.close();
    }
}
