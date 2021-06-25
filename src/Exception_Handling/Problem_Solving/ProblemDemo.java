package Exception_Handling.Problem_Solving;

import java.util.Scanner;

public class ProblemDemo {
    public static void main(String[] args) {
int count = 1;
       do {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("Please Enter Number 1 :");
                int num1 = input.nextInt();

                System.out.println("Please Enter Number 2 :");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result :" + num1 + "/" + num2 + "=" + result);
                count = 2;
            } catch (Exception e) {
                System.out.println("Exception :" + e);
                System.out.println("You must Enter integer, Please try Again");
            }
        }while(count==1);


    }
}
