package com.tlyon.TCP文件上传实现;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        Socket socket = null;
        ServerSocket serverSocket = null;
        OutputStream outputStream = null;


        while (true) {

//            1.创建服务
            serverSocket = new ServerSocket(9000);

//            2.等待客户端连接过来
            socket = serverSocket.accept();//阻塞式监听，会一直等待客户端连接


//            3.读取客户端的消息
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("收到qingjiang.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }


            outputStream = socket.getOutputStream();
            outputStream.write(("服务器"+"收到qingjiang.jpg").getBytes());

            outputStream.close();
            fileOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        }
    }
}
