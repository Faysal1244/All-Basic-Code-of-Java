package LoopExample;

import java.util.Scanner;

public class Table02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter Number of your Table: ");
        num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + "=" + num * i);
        }
    }
}
