package comT_Lyon.method1.allDirectory;

import org.junit.Test;

import java.io.File;

public class TestEach {
    //    遍历所有文件
    @Test
    public void createFile() throws Exception {
        File file = new File("c:");
        String[] list = file.list();
        for (String lists : list) {
            System.out.println(lists);
        }
        File[] file2 = file.listFiles();
        for (File file2s : file2
        ) {
            System.out.println(file2s);
        }
    }

    @Test
    public void dgAllData() {
        File file = new File("F:\\校园文件");
        dg(file);
    }

    public void dg(File file) {
        if (!file.isDirectory()) {
            System.out.println(file.getPath());
            return;
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                dg(f);
            }
        }
    }
}
