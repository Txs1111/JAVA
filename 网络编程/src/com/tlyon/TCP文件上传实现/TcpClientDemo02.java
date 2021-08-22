package com.tlyon.TCP文件上传实现;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        OutputStream os = null;
        //1. 创建一个socket连接
        socket = new Socket(InetAddress.getByName("192.168.0.103"), 9000);
        //2.创建一个输出流
        os = socket.getOutputStream();
        //3.读取文件
        FileInputStream fis = new FileInputStream(new File(("qingjiang.jpg")));
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
