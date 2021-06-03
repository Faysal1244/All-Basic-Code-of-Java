package Array;

import java.util.Arrays;

public class sorting04 {
    public static void main(String[] args) {
        int[] number ={10,20,65,97,89,36,4,5,65};

        Arrays.sort(number);
        System.out.println("Ascending:");
        for(int i =0;i<9;i++){
            System.out.print(" "+number[i]);
        }
        System.out.println("\nDescending:");
        for(int i =8;i>=0;i--){
            System.out.print(" "+number[i]);
        }
    }
}
