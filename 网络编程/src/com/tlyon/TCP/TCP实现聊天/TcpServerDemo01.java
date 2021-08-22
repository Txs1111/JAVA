package com.tlyon.TCP.TCP实现聊天;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo01 {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        ByteArrayOutputStream baos = null;
        InputStream is = null;
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
//            1.我得有一个地址
            serverSocket = new ServerSocket(9999);
//            服务器循环接受信息
            while (true) {
//            2.等待客户端连接过来
                socket = serverSocket.accept();
//            3.读取客户端的消息
                is = socket.getInputStream();
            /*
                有缺陷，如果出现中文就会乱码。因为每次读到msg里面都是1024个字符。会中断字符。造成乱码。
                byte[] buffer = new byte[1024];
                            int len;
                            while ((len = is.read(buffer)) != -1) {
                                String msg = new String(buffer, 0, len);
                                System.out.println(msg);
                            }
             */
                baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    baos.write(buffer, 0, len);
                }
                System.out.println(baos.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
