package File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("G:/Person.txt");

        dir.mkdir();

        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());
//        if (dir.delete()) {
//            System.out.println("Folder Has been deleted");
//        }
    }
}

