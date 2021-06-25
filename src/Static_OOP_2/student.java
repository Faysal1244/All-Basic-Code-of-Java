package Static_OOP_2;

public class student {
    static int count = 0;

    student() {
        count++;
    }

    void totalStudent() {
        System.out.println("Total Student =" + count);
    }
}

