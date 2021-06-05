package OOP;

public class Teacher {

    String name, gender;
    int phone;

    //Set by parameter

    void setInfo(String n, String m, int ph)
    {
        name= n;
        gender= m;
        phone = ph;
    }

    //Using Construct
    Teacher(String n2, String m2, int ph2){
        name= n2;
        gender= m2;
        phone = ph2;
    }

    //Default Constructor

    Teacher()
    {
        System.out.println("No Value");
    }

    //Displaying Information
    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("Phone : " + phone);
    }
}
