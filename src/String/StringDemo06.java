package String;

public class StringDemo06 {
    public static void main(String[] args) {
        String s1="madam";

        StringBuffer sb=new StringBuffer(s1);

         sb.reverse();

        if(s1.equals(sb))
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
