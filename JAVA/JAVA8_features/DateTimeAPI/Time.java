package Class;

import java.util.*;
import java.time.*;

public class Time {
    public static void main(String[] args) {
        LocalTime now= LocalTime.now();
        System.out.println("now the time is :"+ now);

        LocalTime ConstomeTime= LocalTime.of(23,15);
        System.out.println("The required time is : "+ ConstomeTime);

        LocalTime plusOneHour= now.plusHours(1);
        System.out.println("Time after one hour is :" + plusOneHour);
    }
}
