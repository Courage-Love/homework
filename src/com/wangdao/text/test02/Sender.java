package com.wangdao.text.test02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, byName, 9999);
        datagramSocket.send(datagramPacket);

        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, 0, bytes1.length);
        datagramSocket.receive(datagramPacket1);
        byte[] data = datagramPacket1.getData();
        int length = datagramPacket1.getLength();
        int offset = datagramPacket1.getOffset();
        String str = new String(data, offset, length);
        System.out.println("你已经出生了" + str + "天");
        datagramSocket.close();
    }
}
