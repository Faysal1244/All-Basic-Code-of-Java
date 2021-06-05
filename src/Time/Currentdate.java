package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Currentdate {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        //Date wITH FORMAT

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

        String currentDate = dateFormat.format(date);

        System.out.println("Current Date = " + currentDate);

    }
}
