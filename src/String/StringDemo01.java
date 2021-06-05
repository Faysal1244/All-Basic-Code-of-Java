package String;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "Faysal Rahman";
        String s2 = "Faysal Rahman";
        char[] s3 = {'a', 'b', 'c', 'h', 'f'};

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

        int len = s1.length();
        System.out.println("Length of S1 is : " + len);

        if (s1 == s2) {
            System.out.println("Equalse");
        } else {
            System.out.println("Not Equals");
        }


        //.equuals is case sensitive

        if (s1.equals(s2)) {
            System.out.println("Equalse");
        } else {
            System.out.println("Not Equals");
        }

        //case insensitive

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equalse");
        } else {
            System.out.println("Not Equals");
        }

        //Contains using

        if (s1.contains(s2)) {
            System.out.println("Equalse");
        } else {
            System.out.println("Not Equals");
        }

//         using of Contains
        boolean con = s1.contains("Fays");
        System.out.println(con);

        //Is Empty Methods
        boolean b;
        b = s1.isEmpty();
        System.out.println("b =" + b);


    }
}
