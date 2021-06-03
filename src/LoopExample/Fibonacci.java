package LoopExample;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first, second,result,i , num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Last Position You Want : ");
        num=input.nextInt();
        for( i=0;i<=num;i++){
            first=i;
            second=i+1;
            System.out.print(i +second);
        }

    }
}
