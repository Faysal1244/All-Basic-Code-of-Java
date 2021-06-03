package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Java_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n <= 5 && 2 <= n) {
            System.out.println("Not Weird");
        } else if (n <= 20 && 6 <= n) {
            System.out.println("Weird");
        } else if (n >= 20) {
            System.out.println("Not Weird");
        }
    }

//        scanner.close();

// catch(Exception e)
//         {
//             e.printStackTrace();
//         }
}

