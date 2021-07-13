package ABdul_Bari.FileExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fiss = new FileInputStream("E:/Temp/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fiss);

        int x;
        while ((x = bis.read())!=-1)
        {
            System.out.println((char)x);
        }
    }
}
