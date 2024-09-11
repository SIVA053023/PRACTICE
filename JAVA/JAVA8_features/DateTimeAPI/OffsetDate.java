package Class;
import java.util.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDate {
    public static void main(String[] args) {
        OffsetDateTime now=OffsetDateTime.now();
        System.out.println(now);

        OffsetDateTime specificDateTime = OffsetDateTime.of(2024, 9, 11, 14, 30, 0, 0, ZoneOffset.of("+02:00"));
        System.out.println("Specific date and time with offset: " + specificDateTime);
    }
}
