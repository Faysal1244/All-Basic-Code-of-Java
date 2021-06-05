package NumberSystem;

public class DecimalToOthers {
    public static void main(String[] args) {

        int decimal = 15;

        String binary = Integer.toBinaryString(decimal);

        System.out.println(binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        String hex = Integer.toHexString(decimal);
        System.out.println(hex);
    }
}
