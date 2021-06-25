package ENCOACADEMY.Inheritence;

class animal {
    void eat() {
        System.out.println("Super class : Animal is eating");
    }

    void sleep() {
        System.out.println("Super class : Animal is Sleeping");
    }

    void move() {
        System.out.println("Super class : Animal is Moving");
    }
}

class dog extends animal {
    void dark(){
        System.out.println("Child class : Dog is Barking");
    }
}

public class TestInheritance {

    public static void main(String[] args) {
        dog dog = new dog();
        dog.dark();
    }
}
