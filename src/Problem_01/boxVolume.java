package Problem_01;

import java.util.Scanner;

public class boxVolume {
    public static void main(String[] args) {
        double i, j, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter data for box 1 = ");
        i= input.nextDouble();
        j = input.nextDouble();
        k = input.nextDouble();

        box box1 = new box(i, j, k);

        box box2 = new box(20, 30, 10);

        box1.displayVol();
        box2.displayVol();
    }
}
