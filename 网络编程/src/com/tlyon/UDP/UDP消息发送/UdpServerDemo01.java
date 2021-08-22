package com.tlyon.UDP.UDP消息发送;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

@SuppressWarnings("all")

public class UdpServerDemo01 {
    public static void main(String[] args) throws Exception {
        while (true) {
            //开放端口
            DatagramSocket datagramSocket = new DatagramSocket(9090);
            //接收数据包

            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);


            //接收消息
            datagramSocket.receive(datagramPacket);//阻塞接收

            System.out.println(datagramPacket.getAddress().getHostAddress());
            System.out.println(new String(datagramPacket.getData(), "UTF-8"));

            //关闭连接
            datagramSocket.close();
        }
    }
}
