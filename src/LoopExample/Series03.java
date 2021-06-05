package LoopExample;

import java.util.Scanner;

public class Series03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("please Enter number :");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\n" + sum);

    }
}






