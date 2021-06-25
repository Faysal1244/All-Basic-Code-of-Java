package Keywords.Super.Super;

public class B extends A {
    int x = 5;

    void display() {
        System.out.println(super.x);
    }

    void message() {
        super.message();
        System.out.println("Message From B : ");
    }

    B(){
        super();
        System.out.println("Constructor For B");
    }
}
