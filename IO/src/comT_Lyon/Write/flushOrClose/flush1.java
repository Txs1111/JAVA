package comT_Lyon.Write.flushOrClose;

import org.junit.Test;

import java.io.FileWriter;

public class flush1 {
    @Test
    public void demo1() throws Exception {
        FileWriter fileWriter = new FileWriter("src\\comT_Lyon\\Write\\flushOrClose\\a.txt",true);


        fileWriter.write("受不了");
        fileWriter.flush();
        fileWriter.close();
    }
}
