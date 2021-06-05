package JavaClass;

import java.util.Scanner;

import static java.lang.Math.max;

public class AllClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        x = 2;
        y = 3;

        int z = max(x, y);
        System.out.println("Maximum = " + z);

        int min = Math.min(x, y);
        System.out.println("Minimum = " + min);

        double pow = Math.pow(x, y);
        System.out.println("Pow = " + pow);

    }
}














