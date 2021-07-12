package ABdul_Bari.Exception_Handling;

public class TryCatch {
    public static void main(String[] args) {
        int a = 10, b = 2, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Divided By 0");
        }
    }
}
