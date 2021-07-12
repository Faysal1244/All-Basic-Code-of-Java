package ENCOACADEMY.Upcasting.Upcastingproject;

public class Engineer extends Employee{
    @Override
    void doSomething()
    {
        System.out.println("Engineer :  Working .....");
    }

    void doDeveloping()
    {
        System.out.println("Engineer : Developing .....");
    }
}
