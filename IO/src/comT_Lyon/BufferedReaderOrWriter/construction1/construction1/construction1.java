package comT_Lyon.BufferedReaderOrWriter.construction1.construction1;

import org.junit.Test;

import java.io.*;

public class construction1 {
    @Test
    public void demo1() throws Exception {
        FileReader fileReader = new FileReader("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\construction1\\a.txt");
        FileWriter fileWriter = new FileWriter("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\construction1\\a.txt");
//        创建一个新的缓存输入流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        创建一个新的缓存输出流
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


//        第二种方法
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\construction1\\a.txt"));
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("src\\comT_Lyon\\BufferedReaderOrWriter\\construction1\\construction1\\a.txt"));
    }
}
