package comT_Lyon.method1.createOrMkdirOrDelete;

import org.junit.Test;

import java.io.File;

public class TestCreateDelete {
    @Test
    public void createFile() throws Exception {

        File a = new File("D:\\IDEA\\Code\\JAVA\\IO\\src\\comT_Lyon\\method3\\a");
        File a2 = new File("D:\\IDEA\\Code\\JAVA\\IO\\src\\comT_Lyon\\method3\\a1");
        File a3 = new File("D:\\IDEA\\Code\\JAVA\\IO\\src\\comT_Lyon\\method3\\a1\\2");

//        添加文件的
        a.createNewFile();
//        创建 单个 文件目录，多层文件目录不会创建
        a2.mkdir();
//        创建多层文件目录
        a3.mkdirs();
        /*  ！注意如果文件和文件夹重名就不会创建，而且如果文件或文件夹已经存在也不会创建*/

//        删除文件或文件目录
        a2.delete();
        /* ! 注意：只能删除空文件夹，里面有文件夹也不行*/




    }
}
