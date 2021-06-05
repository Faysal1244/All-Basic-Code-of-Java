package LoopExample;

import java.util.Scanner;

public class Pattern001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter Number For Your Pattern : ");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.print("\n");
        }

    }
}
