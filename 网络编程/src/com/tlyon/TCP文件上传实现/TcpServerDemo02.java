package com.tlyon.TCP文件上传实现;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = null;
        InputStream is = null;
        Socket socket = null;
        ServerSocket serverSocket = null;
//            1.创建服务
        while (true) {
            serverSocket = new ServerSocket(9000);
//            2.等待客户端连接过来
            socket = serverSocket.accept();//阻塞式监听，会一直等待客户端连接
//            3.读取客户端的消息
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("收到qingjiang.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.close();
            is.close();
            socket.close();
            serverSocket.close();
            System.out.println("接受到文件");
        }
    }
}
