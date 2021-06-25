package Static_OOP_4;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 101;
        name = "Faysal";
    }

    static void display() {
        System.out.println("Id " + id);
        System.out.println("name = " + name);

    }


    public static void main(String[] args) {
        StaticBlock.display();
    }
}
