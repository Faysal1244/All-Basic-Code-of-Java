package ABdul_Bari.FileExample;

import java.io.*;

class Student implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;

    public static int Data = 10;
    public transient int t;

    public Student() {

    }

    public Student(int rollno, String name, float avg, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll" + rollno +
                "\nAverage" + avg +
                "\nDept" + dept +
                "\nData" + Data +
                "\nTransient" + t + "\n";
    }
}

public class Serialazation {
//    public static void main(String[] args) throws Exception {
//
//        FileOutputStream fos = new FileOutputStream("E:\\Temp\\test.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        Student s = new Student(10, "Faysal", 89.9f, "CSE");
//
//        oos.writeObject(s);
//        fos.close();
//        oos.close();
//    }

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:\\Temp\\test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s =(Student) ois.readObject();
        System.out.println(s+" ");
        fis.close();
        ois.close();
    }
}
