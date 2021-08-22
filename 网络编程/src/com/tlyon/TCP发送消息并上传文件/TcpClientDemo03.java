package com.tlyon.TCP发送消息并上传文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo03 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        OutputStream os = null;
        //1. 创建一个socket连接
        socket = new Socket(InetAddress.getByName("192.168.0.103"), 9000);
        //2.创建一个输出流
        os = socket.getOutputStream();
        //3.读取文件
        String name = "qingjiang.jpg";
        FileInputStream fis = new FileInputStream(new File((name)));
        //将文件名传递过去
        os = socket.getOutputStream();
        os.write(name.getBytes());
        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        fis.close();
        os.close();
        socket.close();

    }
}
