package OOP_PolyMorphism;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person();
//        Teacher t = new Teacher();
//        Student s = new Student();
//
//        p.display();
//        t.display();
//        s.display();

        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();
    }
}
