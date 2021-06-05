package String;

public class StringBuffer05 {
    public static void main(String[] args) {

        String s1 = "faysal";
        StringBuffer sb = new StringBuffer(s1);
//        StringBuffer sb = new StringBuffer("faysal");

        System.out.println(sb);

        sb.append(" Rahman");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();

        sb.delete(0, 2);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

        int d;
    }
}
