package Linked_List.Student_List;

import java.util.LinkedList;

public class Student_List_demo {
    public static void main(String[] args) {

        LinkedList<Student> list = new LinkedList<Student>();

        //Create a Student

        Student s1 = new Student(101,"Karim","Eleven");
        Student s2 = new Student(102,"Rahim","Eleven");
        Student s3 = new Student(103,"Sharif","Eleven");
        Student s4 = new Student(104,"Turin","Eleven");
        Student s5 = new Student(105,"Shahin","Eleven");


        //Adding Student to the list

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //Information Display

        for (Student s: list) {
            System.out.println(s.id+" "+s.name+" "+s.className);
        }
    }
}
