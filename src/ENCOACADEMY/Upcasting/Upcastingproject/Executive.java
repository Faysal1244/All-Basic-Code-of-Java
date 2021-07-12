package ENCOACADEMY.Upcasting.Upcastingproject;

public class Executive extends Employee{

    @Override
    void doSomething()
    {
        System.out.println("Executive : Working .....");
    }

    void doCheck()
    {
        System.out.println("Executive : Checking .....");
    }
}
