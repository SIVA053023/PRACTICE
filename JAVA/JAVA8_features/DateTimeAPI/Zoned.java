package Class;
import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Zoned {
    public static void main(String[] args) {
       ZonedDateTime now = ZonedDateTime.now();
       System.out.println(now);


       ZonedDateTime Specific= ZonedDateTime.of(2000,5,24,14,25,0,0,ZoneId.of("Europe/Paris"));
       System.out.println(Specific);

      ZonedDateTime plus= now.plusDays(20).plusHours(5);
      System.out.println(plus);
       

    }
}
