package comT_Lyon.PrintStream1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class eg {
    @Test
    public void demo1() throws Exception {
//        字节输出打印流PrintStream复制文本文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\comT_Lyon\\PrintStream1\\copy.txt"));
        PrintStream printStream = new PrintStream("src\\comT_Lyon\\PrintStream1\\printcopy.txt");
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            printStream.println(line);
        }
        bufferedReader.close();
        printStream.close();

    }
}
