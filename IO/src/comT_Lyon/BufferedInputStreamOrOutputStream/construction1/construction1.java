package comT_Lyon.BufferedInputStreamOrOutputStream.construction1;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class construction1 {
    @Test
    public void demo1() throws Exception {
        FileInputStream inputStream = new FileInputStream("src\\comT_Lyon\\Buffered1\\construction1\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\Buffered1\\construction1\\a.txt");
//        创建一个新的缓存输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        创建一个新的缓存输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


//        第二种方法
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream("src\\comT_Lyon\\Buffered1\\construction1\\a.txt"));
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream("src\\comT_Lyon\\Buffered1\\construction1\\a.txt"));
    }
}
