package comT_Lyon.Write.construction1;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;

public class construction1 {
    @Test
    public void demo1() throws Exception {

        File file = new File("src\\comT_Lyon\\Write\\construction\\a.txt");
        FileWriter fileWriter = new FileWriter(file);


        FileWriter fileWriter1 = new FileWriter("src\\comT_Lyon\\Write\\construction\\a.txt");
    }
}
