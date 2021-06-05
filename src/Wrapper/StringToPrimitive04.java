package Wrapper;

public class StringToPrimitive04 {

    public static void main(String[] args) {
        String s = "32";

        //First Method
        int i = Integer.parseInt(s);
        System.out.println("i =" + i);

        //Second Methods

        int a = Integer.valueOf(s);

        System.out.println(a);

    }
}
