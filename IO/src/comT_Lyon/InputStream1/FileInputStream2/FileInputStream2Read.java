package comT_Lyon.InputStream1.FileInputStream2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class FileInputStream2Read {
    @Test
//    读取字节：read方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回-1
    public void demo1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream2\\a.txt");
        int read;
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
    }

    @Test
//    循环改进读取方式，
    public void demo2() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream2\\a.txt");
        FileInputStream fileInputStream2 = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream2\\a.txt");
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.print(read);
        }
        System.out.println();
        while ((read = fileInputStream2.read()) != -1) {
            System.out.print((char) read);
        }
    }

    @Test
//    使用字节数组读取：read(byte[] b)，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回-1
    public void demo3() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream2\\a.txt");
        byte b[] = new byte[3];
        int read;
        while ((read = fileInputStream.read(b)) != -1) {
            System.out.print(new String(b));
            System.out.print("---read:" + read);
            System.out.println("---b[]:" + Arrays.toString(b));
        }
    }

    @Test
//    使用字节数组读取：read(byte[] b)，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回-1
    public void demo4() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream2\\a.txt");
        byte b[] = new byte[3];
        int read;
        while ((read = fileInputStream.read(b)) != -1) {
            System.out.print(new String(b, 0, read));
            System.out.print("---read:" + read);
            System.out.println("---b[]:" + Arrays.toString(b));
        }
    }
}
