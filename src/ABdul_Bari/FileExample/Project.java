package ABdul_Bari.FileExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Project {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/Temp/test.txt");
        FileOutputStream fos = new FileOutputStream("E:/Temp/test2.txt");

        int b;

        while ((b = fis.read()) != -1) {
            if ((b > 65 && b <= 90)) {
                fos.write(b + 32);
            } else {
                fos.write(b);
            }
        }

        fis.close();
        fos.close();
    }
}
