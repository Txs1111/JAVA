package comT_Lyon.newFile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestFile {

    @Test
    public void createFile(){
        File a= new File("实验路径\\a.txt");
        //并不会创建文件
    }
}
