package LoopExample;

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fact = 1;
        System.out.println("Enter Any Number");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " = " + fact);


    }
}
