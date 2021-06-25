package CallByValue_Refrence;

public class TestRefrence {
    public static void main(String[] args) {
        CallByrefrence r1 = new CallByrefrence();
        r1.name= "John";

        System.out.println("Before Call "+r1.name);

        r1.change(r1);

        System.out.println("After Call "+r1.name);
    }
}
