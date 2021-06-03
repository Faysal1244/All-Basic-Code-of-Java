package String;

public class StringDemo03 {
    public static void main(String[] args) {
        String country = "bangladesh is My Country";

        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println("ch =" + ch);

        int value = country.codePointAt(0);

        System.out.println("Value =" + value);

        int pos = country.indexOf('n');
        System.out.println("First Position of n ="+pos);

        pos = country.lastIndexOf('n');
        System.out.println("Last Index of n = "+pos);
    }
}
