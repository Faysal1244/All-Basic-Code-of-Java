package Keywords.Super.Super.Mini_Example;

public class Car extends Veihcle {

    int gear;

    Car(String c, double w, int g) {
        super(c, w);
        gear = g;
    }

     @Override
     void attribute(){
       super.attribute();
         System.out.println("Gear = "+gear);

     }
}
