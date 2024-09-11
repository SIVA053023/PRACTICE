import java.time.LocalTime;
import java.util.*;

public class Test{
    public static void main(String[] args) {
      LocalTime now= LocalTime.now();
       System.out.println(now);
        LocalTime one=now.of(45,26);
        System.out.println(one);
    }
}