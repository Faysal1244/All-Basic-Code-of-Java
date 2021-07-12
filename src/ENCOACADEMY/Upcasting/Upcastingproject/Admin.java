package ENCOACADEMY.Upcasting.Upcastingproject;

public class Admin extends Employee{

    @Override
    void doSomething()
    {
        System.out.println("Admin:  Working .....");
    }

    void doHire(){
        System.out.println("Admin : Hiring .....");
    }
}
