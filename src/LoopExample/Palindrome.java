package LoopExample;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, temp, sum = 0, r;
        System.out.println("Enter Your Integer: ");
    num =input.nextInt();
    temp =num;
        while(temp !=0){
        r = temp % 10;
        sum = sum * 10 + r;
        temp = temp / 10;
    }
        System.out.println("Reverse = "+sum);
        if(num==sum) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
            }
        }
}

