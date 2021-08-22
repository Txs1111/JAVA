package com.tlyon.TCP发送消息并上传文件;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo03 {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = null;
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
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
//            将传递过来的文件名赋值到name里
            String name = baos.toString();
//            文件接受
            fos = new FileOutputStream(new File("收到" + name));
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            baos.close();
            fos.close();
            is.close();
            socket.close();
            serverSocket.close();
            System.out.println("接受到文件并转为——"+"收到" + name);
        }
    }
}
