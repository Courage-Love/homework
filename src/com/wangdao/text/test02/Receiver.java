package com.wangdao.text.test02;

import java.io.IOException;
import java.net.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        int offset = datagramPacket.getOffset();
        String s = new String(data, offset, length);

        String days = "1000"; // 天数差
        byte[] bytes1 = days.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, 0, bytes1.length, byName, 8888);
        datagramSocket.send(datagramPacket1);
        datagramSocket.close();
    }
}
