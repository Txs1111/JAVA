package comT_Lyon.Read.construction;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;

public class construction1 {
    @Test
    public void demo1() throws Exception {
        File file = new File("src\\comT_Lyon\\Read\\construction\\a.txt");
        FileReader fileReader = new FileReader(file);


//        第二种
        FileReader fileReader1 = new FileReader("src\\comT_Lyon\\Read\\construction\\a.txt");
    }
}
