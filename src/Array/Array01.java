package Array;

import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        int i;
        double sum = 0;
        System.out.println("Enter Your Desire Number: ");

        for ( i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for ( i=0; i<number.length ;i++){
            sum = sum + number[i];
        }
        System.out.println("The Sum of Number is "+sum);
    }
}
