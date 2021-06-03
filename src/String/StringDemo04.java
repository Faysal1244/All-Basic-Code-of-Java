package String;

public class StringDemo04 {
    public static void main(String[] args) {
        String s1 = "This is my country";
//Replace Methods

        String s2 = s1.replace('i', 'k');
        System.out.println(s2);
//        Split Methods

        String[] s3 = s1.split(" ");
        for (String X : s3) {
            System.out.println(X);
        }
    }
}
