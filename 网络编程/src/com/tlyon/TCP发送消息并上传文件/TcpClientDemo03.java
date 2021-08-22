package com.tlyon.TCP发送消息并上传文件;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo03 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;


        //1. 创建一个socket连接
        socket = new Socket(InetAddress.getByName("192.168.0.103"), 9000);


        //2.创建一个输出流
        outputStream = socket.getOutputStream();


        //3.读取文件
        String name = "qingjiang.jpg";
        fileInputStream = new FileInputStream(new File((name)));
        //将文件名传递过去
        outputStream = socket.getOutputStream();
        outputStream.write(name.getBytes());


        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }

        //创建输入流
        InputStream inputStream = socket.getInputStream();
        //创建输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0, len);
        }


        fileInputStream.close();
        outputStream.close();
        socket.close();

    }
}
