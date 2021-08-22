package com.tlyon.UDP.多线程实现双方互相发送消息;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable {
    DatagramSocket datagramSocket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try {
            datagramSocket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            //准备接收包裹
            try {
                byte[] container = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(container, 0, container.length);
                datagramSocket.receive(datagramPacket);//阻塞式接收包裹

                //断开连接
                byte[] data = datagramPacket.getData();
                String receiveData = new String(data, 0, data.length);

                System.out.println(msgFrom + ":" + receiveData);
                if (receiveData.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //关闭流
        datagramSocket.close();
    }
}
