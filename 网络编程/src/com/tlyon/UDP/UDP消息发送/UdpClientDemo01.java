package com.tlyon.UDP.UDP消息发送;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

@SuppressWarnings("all")
//不需要连接服务器
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {

        //1.建立一个Socket
        DatagramSocket datagramSocket = new DatagramSocket();

        //2.建个包
        InetAddress localhost = InetAddress.getByName("localhost");//此处的InetAddress可以直接调用不需要new！
        String msg = "你好啊,服务器！";
        int port = 9090;

        //数据，数据的长度起始，要发送给谁
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.length(), localhost, port);


        //3.发送包
        datagramSocket.send(datagramPacket);

        //4.关闭流
        datagramSocket.close();

    }
}
