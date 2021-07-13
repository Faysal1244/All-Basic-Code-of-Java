package ABdul_Bari.FileExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Project2 {

    public static void main(String[] args) throws Exception {

//        FileInputStream fis1 = new FileInputStream("E:/Temp/test.txt");
        FileInputStream fis1 = new FileInputStream("E:/Temp/test.txt");
        FileInputStream fis2 = new FileInputStream("E:/Temp/test2.txt");

        FileOutputStream fos = new FileOutputStream("E:/Temp/Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);


        int b;
        while ((b = sis.read()) != -1) {

            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}