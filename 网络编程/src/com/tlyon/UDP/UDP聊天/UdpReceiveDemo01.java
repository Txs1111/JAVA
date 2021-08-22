package com.tlyon.UDP.UDP聊天;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

@SuppressWarnings("all")
public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        while (true) {


            //准备接收包裹
            byte[] container = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(container, 0, container.length);
            datagramSocket.receive(datagramPacket);//阻塞式接收包裹

            //断开连接
            byte[] data = datagramPacket.getData();
            String receiveData = new String(data, 0, data.length);

            System.out.println(receiveData);
            if (receiveData.equals("bye")) {
                break;
            }
        }

        //关闭流
        datagramSocket.close();
    }
}
