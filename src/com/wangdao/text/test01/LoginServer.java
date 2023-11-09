package com.wangdao.text.test01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @auther cxw
 */
public class LoginServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream bi = new ObjectInputStream(inputStream);
        User user= (User)(bi.readObject());
        OutputStream out = socket.getOutputStream();
        if (user.name.equals("admin") && user.password.equals("admin")) {
            String s = "登录成功";
            byte[] bytes = s.getBytes();
            out.write(bytes, 0, bytes.length);
        }
        socket.close();
    }
}

class User implements Serializable{
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
