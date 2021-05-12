package comT_Lyon.OutputStream1.FileOutputStream2Write;

import org.junit.Test;

import java.io.FileOutputStream;

public class FileOutputStream2Write {
    @Test
    public void demo1() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream2Write\\a.txt");
        fileOutputStream.write(10);
        fileOutputStream.write(11);
        fileOutputStream.write(12);
        fileOutputStream.write(20);
        fileOutputStream.write(21);
        fileOutputStream.write(22);
        fileOutputStream.write(110);
        fileOutputStream.write(111);
        fileOutputStream.write(112);
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        fileOutputStream.close();
    }

    @Test
//    写出字节数组：write(byte[] b)，每次可以写出数组中的数据
    public void demo2() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream2Write\\a.txt");

        byte[] bytes = "老八爱吃粑粑".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    @Test
//   写出指定长度字节数组：write(byte[] b, int off, int len) ,每次写出从off索引开始，len个字节
    public void demo3() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream2Write\\a.txt");
//        utf - 8 中一个中文三个字节
        int len = 3;
        byte[] bytes = "老八爱吃粑粑".getBytes();
        fileOutputStream.write(bytes, 0, len);
        fileOutputStream.close();
    }

    @Test
//   第二个参数中都需要传入一个boolean类型的值，true 表示追加数据，false 表示不追加也就是清空原有数据。这样创建的输出流对象，就可以指定是否追加续写了，至于Windows换行则是 \n\r ，下面将会详细讲到。
    public void demo4() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream2Write\\a.txt", true);
//        utf - 8 中一个中文三个字节
        int len = 3;
        byte[] bytes = "老八爱吃粑粑".getBytes();
        fileOutputStream.write(bytes, 0, len);
        fileOutputStream.close();
    }

    @Test
//    Windows系统里，换行符号是\r\n
    public void demo5() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream2Write\\a.txt");

        byte[] bytes = "bibasf\r\nsaff".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
