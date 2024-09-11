package Class;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class One {
    public static void main(String[] args) {
        String date="24/10/2000 15:45:23";
        DateTimeFormatter one= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime result=LocalDateTime.parse(date, one);
        System.out.println(result);

    }
}
