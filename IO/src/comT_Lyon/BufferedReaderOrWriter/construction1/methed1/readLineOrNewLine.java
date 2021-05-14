package comT_Lyon.BufferedReaderOrWriter.construction1.methed1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class readLineOrNewLine {
    @Test
    public void demo1() throws Exception {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\methed1\\a.txt"));
        // 定义字符串,保存读取的一行文字
        String line;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine()) != null) {
            System.out.print(line);
            System.out.println("------");
        }
        // 释放资源
        br.close();
    }


    @Test
    public void demo2() throws Exception {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\methed1\\b.txt"));
        // 写出数据
        bw.write("哥");
        // 写出换行
        bw.newLine();
        bw.write("敢");
        bw.newLine();
        bw.write("摸屎");
        bw.newLine();
        bw.write("你敢吗？");
        bw.newLine();
        // 释放资源
        bw.close();
    }
}
