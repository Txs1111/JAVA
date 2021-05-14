package comT_Lyon.InputStreamReader1;

import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class contruction1 {
    @Test
    public void demo1() throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("src\\comT_Lyon\\InputStreamReader1\\a.txt"));
        InputStreamReader inputStreamReader1 = new InputStreamReader(new FileInputStream("src\\comT_Lyon\\InputStreamReader1\\a.txt"), "GBK");
    }
    @Test
    public void demo2() throws Exception{
        // 定义文件路径,文件为gbk编码
        String FileName = "src\\comT_Lyon\\InputStreamReader1\\b.txt";
        // 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));
        // 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName) , "GBK");
        // 定义变量,保存字符
        int read;
        // 使用默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char)read); //      ʺ
        }
        isr.close();

        // 使用指定编码字符流读取,正常解析
        while ((read = isr2.read()) != -1) {
            System.out.print((char)read);// 哥敢摸屎
        }
        isr2.close();

    }


}
