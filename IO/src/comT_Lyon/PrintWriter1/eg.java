package comT_Lyon.PrintWriter1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class eg {
    @Test
    public void demo1() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\comT_Lyon\\PrintWriter1\\aa.txt"));
        PrintWriter printWriter = new PrintWriter("src\\comT_Lyon\\PrintWriter1\\printcopyaa.txt");
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            printWriter.println(line);
        }
        bufferedReader.close();
        printWriter.close();

    }
}
