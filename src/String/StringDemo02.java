package String;

public class StringDemo02 {
    public static void main(String[] args) {
        String firstName = "faysal";
        String lastName = " Rahman";

        String fullName= firstName + lastName ;
        String fullname = firstName.concat(lastName);
        System.out.println("FullName = "+fullName);

        System.out.println("With Concat = "+fullname);

        //UpperCase
        String upperName = fullName.toUpperCase();
        System.out.println("WIth Upper Case = "+upperName);

        //Lower Case
        String lowerName = fullName.toLowerCase();
        System.out.println("WIth lowerName Case = "+lowerName);

        //Starts With
        boolean b = firstName.startsWith("A");
        System.out.println(b);

        //Ends With
        boolean c = lastName.endsWith("A");
        System.out.println(c);

        String[] names = {"faysal","Sobuj","Niloy"};

        for (String x:names) {
            System.out.print(x+" ");
        }

    }
}
