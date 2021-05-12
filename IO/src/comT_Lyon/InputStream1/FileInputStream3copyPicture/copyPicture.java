package comT_Lyon.InputStream1.FileInputStream3copyPicture;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyPicture {
    @Test
    public void demo1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\InputStream1\\FileInputStream3copyPicture\\1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\comT_Lyon\\InputStream1\\FileInputStream3copyPicture\\1copy.png");

        int read;
        byte[] bytes = new byte[1024];
        while ((read = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, read);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
