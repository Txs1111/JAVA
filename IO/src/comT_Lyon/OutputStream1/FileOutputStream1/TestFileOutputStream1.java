package comT_Lyon.OutputStream1.FileOutputStream1;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

public class TestFileOutputStream1 {
    @Test
    public void demo1() throws Exception {
//        注意这里如果使用了FileOutputStream读取了文件，文件存在就会清空，不存在就会生成一个。
        File file = new File("src\\comT_Lyon\\OutputStream1\\FileOutputStream1\\v2-465cfb29e39464a9e1a6707e605a97c3_r - 副本.jpg");
        File file2 = new File("src\\comT_Lyon\\OutputStream1\\FileOutputStream1\\out.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

//        方式二
        FileOutputStream fileOutputStream1 = new FileOutputStream("src\\comT_Lyon\\OutputStream1\\FileOutputStream1\\v2-465cfb29e39464a9e1a6707e605a97c3_r - 副本.jpg");

    fileOutputStream.close();
    fileOutputStream1.close();
    }
}
