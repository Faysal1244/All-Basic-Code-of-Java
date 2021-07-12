package ENCOACADEMY.Upcasting;

public class dog  extends Animal{
    @Override
    void eat()
    {
        System.out.println("Animal is eating");
    }
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
