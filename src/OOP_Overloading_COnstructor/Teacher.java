package OOP_Overloading_COnstructor;

public class Teacher {

    String name, gender;
    int phone;

    Teacher() {
        System.out.println("No Information");
    }
    Teacher(String n, int ph) {
        name = n;
        phone = ph;

    }
    Teacher(String n, String g, int ph) {
        name = n;
        gender = g;
        phone = ph;
    }

    void displayInformation(){
        System.out.println("Name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("Phone : " + phone);
    }
}
