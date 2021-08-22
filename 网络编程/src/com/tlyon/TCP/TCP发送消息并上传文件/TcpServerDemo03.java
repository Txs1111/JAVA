package com.tlyon.TCP.TCP发送消息并上传文件;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo03 {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        Socket socket = null;
        ServerSocket serverSocket = null;
        String cilentFileName = null;
        String ServerFilename = null;
        OutputStream outputStream = null;
        byte[] buffer = new byte[1024];
        int len;
        byte[] buffer2 = new byte[1024];
        int len2;

        while (true) {

//            1.创建服务
            serverSocket = new ServerSocket(9000);


//            2.等待客户端连接过来
            socket = serverSocket.accept();//阻塞式监听，会一直等待客户端连接


//            3.读取客户端的消息
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();

            while ((len = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }

//            将传递过来的文件名赋值到name里
            cilentFileName = byteArrayOutputStream.toString();
            ServerFilename = "收到" + cilentFileName;


//            文件接收
            fileOutputStream = new FileOutputStream(new File(ServerFilename));

            while ((len2 = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            System.out.println("接受到文件并转为——" + ServerFilename);


//            返回消息给客户端
            outputStream = socket.getOutputStream();
            outputStream.write(("服务器接受到文件并转为——" + ServerFilename).getBytes());

            outputStream.close();
            fileOutputStream.close();
            byteArrayOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        }
    }
}
