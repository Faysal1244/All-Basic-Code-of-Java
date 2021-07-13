package ABdul_Bari.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fis = new FileInputStream("E:/Temp/test.txt")) {


            int x;

            while ((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
                //Method 2
           /* do {
                x = fis.read();
                if(x!=-1)
                System.out.print((char) x);
            } while (x != -1);*/

            //Method 3
            /*byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);*/

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
