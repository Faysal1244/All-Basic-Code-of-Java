package String;

public class StringBuilder07 {
    public static void main(String[] args) {
        String s1 = ("Faysal");
        StringBuilder str = new StringBuilder(s1);

        System.out.println(str);
        str.append(" Rahman");

        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(2, 5);
        System.out.println(str);

    }
}
