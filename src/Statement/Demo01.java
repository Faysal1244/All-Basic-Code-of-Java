package Statement;
import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter Any Integer: ");
        num=input.nextInt();
        if(num>0){
        System.out.println("Positive");
        }
        else if(num==0){
            System.out.println("Number is 0");
        }
        else{
            System.out.println("Negative");
        }
    }


}
