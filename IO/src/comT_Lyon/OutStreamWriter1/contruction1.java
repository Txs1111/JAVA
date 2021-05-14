package comT_Lyon.OutStreamWriter1;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class contruction1 {
    @Test
    public void demo1() throws Exception{
        OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("src\\comT_Lyon\\OutStreamWriter1\\a.txt"));
        OutputStreamWriter isr2 = new OutputStreamWriter(new FileOutputStream("src\\comT_Lyon\\OutStreamWriter1\\b.txt") , "GBK");
    }
    @Test
    public void demo2() throws Exception{
        // 定义文件路径
        String FileName = "src\\comT_Lyon\\OutStreamWriter1\\b.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 写出数据
        osw.write("哥敢"); // 保存为6个字节
        osw.close();

        // 定义文件路径
        String FileName2 = "src\\comT_Lyon\\OutStreamWriter1\\bb.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2),"GBK");
        // 写出数据
        osw2.write("摸shi");// 保存为4个字节
        osw2.close();

    }
}
