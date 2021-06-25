package CallByValue_Refrence;

public class testValue {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();

        int x = 50;

        System.out.println("Before Call "+x);

        ob.change(x);
        System.out.println("After Call "+x);

    }
}
