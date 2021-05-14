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
}
