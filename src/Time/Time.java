package Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);

        // For Formatter

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String timeFormat = time.format(formatter);

        System.out.println(timeFormat);

    }
}
