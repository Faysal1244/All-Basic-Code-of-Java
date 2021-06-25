package File;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File dir = new File("G:/Person");
        dir.mkdir();

        File file1 = new File("G:/Person/Student.txt");
        File file2= new File("G:/Person/teacher.txt");

        try {
        file1.createNewFile();
        file2.createNewFile();
            System.out.println("File has been Created");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
