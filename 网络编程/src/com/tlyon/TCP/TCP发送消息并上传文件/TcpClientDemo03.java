package com.tlyon.TCP.TCP发送消息并上传文件;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo03 {
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
        String cilentFileName = "qingjiang.jpg";
        fileInputStream = new FileInputStream(new File((cilentFileName)));
        //将文件名传递过去
        outputStream = socket.getOutputStream();
        outputStream.write(cilentFileName.getBytes());


        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }


        //通知服务器我已经传输完了
        socket.shutdownOutput();


        //创建输入流
        inputStream = socket.getInputStream();
        //创建输出流
        byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer2)) != -1) {
//      while ((inputStream.read(buffer2,0,len2= buffer.length)) != -1) {
            byteArrayOutputStream.write(buffer2, 0, len2);
        }
        System.out.println(byteArrayOutputStream.toString());

        inputStream.close();
        byteArrayOutputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();

    }
}
