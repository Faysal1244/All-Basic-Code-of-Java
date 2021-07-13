package ABdul_Bari.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("E:/Temp/test.txt");
            String str = "Learn Java ";

            byte[] b = str.getBytes();
            for (byte x : b) {
                fos.write(x);
            }
//            fos.write(str.getBytes());

            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
