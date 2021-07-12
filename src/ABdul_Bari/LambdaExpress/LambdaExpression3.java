package ABdul_Bari.LambdaExpress;

@FunctionalInterface
interface MyLambda3 {
    void display();
}

class  UseLambda{
    public void callLambda(MyLambda3 ml)
    {
        ml.display();
    }
}

class Demo {
    public void method1() {

        MyLambda3 ml = ()-> {
            int count = 110;
            count++;
            System.out.println("hello");
            System.out.println("Bye "+count);
        };
        ml.display();




        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello");
        });
    }
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
