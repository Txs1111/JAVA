package comT_Lyon.InputStream1.FileInputStream1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStream1 {
    @Test
    public void demo1() throws Exception {

        File file = new File("src\\comT_Lyon\\InputStream1\\FileInputStream1\\a.txt");
        FileInputStream fileInputStream1 = new FileInputStream(file);


        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream1\\a.txt");

    }
}
