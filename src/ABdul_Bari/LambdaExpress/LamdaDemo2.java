package ABdul_Bari.LambdaExpress;
@FunctionalInterface
interface MyLambda2 {
    int add(int x, int y);
}
public class LamdaDemo2 {
    public static void main(String[] args) {
        MyLambda2 m2 = (a,b)->{return a + b;};

        System.out.println(m2.add(20,30));
    }
}
