package Method_Overriding;

public class Teacher extends Person{

    String Qualification;

    @Override
    void displayInformation(){
        System.out.println("name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+Qualification);

    }
}
