package comT_Lyon.Buffered1.userBuffered;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class userBuffered {

    @Test
    public void demo1() throws Exception {
        long l = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
        int read;
        while ((read = fileInputStream.read()) != -1) {
            fileOutputStream.write(read);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("普通流--无数组--复制时间:" + (l1 - l) + " 毫秒");//1359ms
        new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
    }

    @Test
    public void demo2() throws Exception {
        long l = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");

        int read;
        byte[] bytes = new byte[1024];
        while ((read = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, read);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (l1 - l) + " 毫秒");//1359ms
        new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
    }


    @Test
    public void demo3() throws Exception {

        long l = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int read;
        while ((read = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(read);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("缓冲流--无数组--复制时间:" + (l1 - l) + " 毫秒");//1146ms
        new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");

    }

    @Test
    public void demo4() throws Exception {

        long l = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int read;
        byte[] bytes = new byte[1024];
        while ((read = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, read);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:" + (l1 - l) + " 毫秒");//122ms
        new FileOutputStream("src\\comT_Lyon\\Buffered1\\userBuffered\\acopy.txt");
    }

    @Test
    public void demo5() throws Exception {
        demo1();
        demo2();
        demo3();
        demo4();
//        这里数据用的比较小，差距还不够明显，实际上比这个数据相差很多很多倍
    }
}
