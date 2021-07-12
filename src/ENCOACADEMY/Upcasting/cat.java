package ENCOACADEMY.Upcasting;


public class cat  extends Animal {
    @Override
    void eat()
    {
        System.out.println("Animal is eating");
    }

    void meow(){
        System.out.println("Cat is Meow");
    }
}
