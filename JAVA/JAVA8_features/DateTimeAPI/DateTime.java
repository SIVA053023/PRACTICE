package Class;

import java.time.LocalDateTime;
import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime one= LocalDateTime.now();
        System.out.println(one);

        LocalDateTime costome= LocalDateTime.of(2000, 10, 24, 14, 15, 45);
        System.out.println(costome);

        LocalDateTime FutureDateAndTime=one.plusDays(3).plusHours(2);
        System.out.println(FutureDateAndTime);
    }
}
