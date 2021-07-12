package ENCOACADEMY.Upcasting;

public class TestDownCasting {
    public static void main(String[] args) {
        Animal a1 = new dog();
        dog c = (dog) a1;
        c.eat();
        a1.eat();
    }
}
