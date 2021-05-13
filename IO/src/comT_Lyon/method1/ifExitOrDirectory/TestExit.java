package comT_Lyon.method1.ifExitOrDirectory;

import org.junit.Test;

import java.io.File;

public class TestExit {
    @Test
    public void createFile() {

        File a = new File("D:\\IDEA\\Code\\JAVA\\IO\\src\\comT_Lyon\\method2\\TestExit.java");
        File a2 = new File("D:\\IDEA\\Code\\JAVA\\IO\\src\\comT_Lyon\\method2\\实验路径");
        System.out.println(a.getPath());
        System.out.println("实验路径 是否存在:"+a2.exists());
        System.out.println("实验路径\\a.txt 是否存在:"+a.exists());
        // 判断是文件还是目录
        System.out.println("实验路径 文件?:"+a2.isFile());
        System.out.println("实验路径 目录?:"+a2.isDirectory());


    }
}
