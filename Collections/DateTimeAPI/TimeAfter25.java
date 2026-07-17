package Collection.DateTimeAPI;

import java.time.LocalTime;

public class TimeAfter25 {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime after25 = currentTime.plusMinutes(25);

        System.out.println("Current Time : " + currentTime);
        System.out.println("After 25 Minutes : " + after25);
    }
}