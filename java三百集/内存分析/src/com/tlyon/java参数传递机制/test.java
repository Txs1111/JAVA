package com.tlyon.java参数传递机制;

import java.io.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/Java学习/2021二级Java/myFile");
        test1();
    }

    //从程序中输出文件
    private static void test1() throws IOException {
        //创建源或目标文件
//        File f = new File("D:/Java学习/first.txt‪");
        File f = new File("D:/Java学习/first.txt");
        //创建IO流对象
        FileOutputStream out = new FileOutputStream(f, true);
        //写出文件
        int i = 65;
        while (i <= 92) {
            out.write(i);
            i++;
        }

//				out.write(65);//写出A
//				out.write(66);//B
//				out.write(67);//C
        String str = "黄大大YYDS";
//				Byte[] str =new Byte[5];
        out.write(str.getBytes());
        //关闭
        out.close();
    }

    //从文件中输入到程序
    private static void test2() throws IOException {
        try {
            //源or目标
            File f = new File(".\\myFile\\first2.txt‪‪‪");
            System.out.println("1");
            //IO流对象
            FileInputStream in = new FileInputStream(f);
            System.out.println("2");
            //读取文件的内容,IO操作
            byte[] b = new byte[5];
            System.out.println(in.read());
            int length = in.read(b);//五个字节长度，并保存到缓存区中
            System.out.println(Arrays.toString(b));
            System.out.println(length);
            //关闭IO流
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("系统找不到该文件");
        }

        System.out.println("success!");
    }


}
