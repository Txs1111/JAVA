package com.tlyon.TCP.TCP文件上传实现;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;


        //1. 创建一个socket连接
        socket = new Socket(InetAddress.getByName("192.168.0.103"), 9000);


        //2.创建一个输出流
        outputStream = socket.getOutputStream();


        //3.读取文件
        fileInputStream = new FileInputStream(new File(("qingjiang.jpg")));


        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }

        //通知服务器我已经传输完了
        socket.shutdownOutput();

//        获取服务器返回的消息
//        创建一个输入流
        inputStream = socket.getInputStream();
        //String byte[]
//        创建一个输出流
        byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer2)) != -1) {
            byteArrayOutputStream.write(buffer2, 0, len2);
        }
        System.out.println(byteArrayOutputStream.toString());

        byteArrayOutputStream.close();
        inputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();

    }
}
