package comT_Lyon.Read.encoding;

import org.junit.Test;

import java.io.FileInputStream;

public class encoding {
    @Test
    public void demo1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src\\comT_Lyon\\Read\\encoding\\a.txt");

        int read;
        byte[] bytes = new byte[1024];
        while ((read = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
        fileInputStream.close();
    }
}
