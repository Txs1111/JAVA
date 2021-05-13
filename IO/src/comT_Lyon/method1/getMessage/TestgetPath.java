package comT_Lyon.method1.getMessage;

import org.junit.Test;

import java.io.File;

public class TestgetPath {

    @Test
    public void createFile() {

//        只是打印出file中对的文件路径
        File a = new File("实验路径\\a.txt");
        System.out.println("文件绝对路径:" + a.getAbsolutePath());
        System.out.println("文件构造路径:" + a.getPath());
        System.out.println("文件名称:" + a.getName());
        System.out.println("文件长度:" + a.length() + "字节");

        File a2 = new File("实验路径\\b.txt");
        System.out.println("目录绝对路径:" + a2.getAbsolutePath());
        System.out.println("目录构造路径:" + a2.getPath());
        System.out.println("目录名称:" + a2.getName());
        System.out.println("目录长度:" + a2.length());

    }
}
