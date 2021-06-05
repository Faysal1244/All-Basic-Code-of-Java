package NumberSystem;

//Conert Binary,POctal,hexadecimal number into Decimal;

public class NumberConversionDemo {
    public static void main(String[] args) {

        String binary = "1010";

        Integer decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);

        String hexadecimal = "A";

        Integer dec = Integer.parseInt(hexadecimal, 16);

        System.out.println(dec);
    }
}
