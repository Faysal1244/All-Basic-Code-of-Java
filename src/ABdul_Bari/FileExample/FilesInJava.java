package ABdul_Bari.FileExample;

import java.io.*;

public class FilesInJava {
    public static void main(String[] args) {
        File f = new File("G:\\Person");

//        System.out.println(f.isDirectory());

     File list[] =  f.listFiles();

        for (File x:list) {
            System.out.println(x.getName());
            System.out.println(x.getPath());

        }
    }
}
