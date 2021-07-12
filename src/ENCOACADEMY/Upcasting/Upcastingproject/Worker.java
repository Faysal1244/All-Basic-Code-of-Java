package ENCOACADEMY.Upcasting.Upcastingproject;

public class Worker extends Employee{

    @Override
    void doSomething()
    {
        System.out.println("Worker : Working .....");
    }

    void doSet ()
    {
        System.out.println("Worker : Setting .....");
    }
}
