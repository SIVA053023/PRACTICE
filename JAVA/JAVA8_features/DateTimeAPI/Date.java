package Class;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * LocalDate
 */
public class Date {

    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("Today date is :"+today);

        LocalDate paricularDate= LocalDate.of(2000, 10, 24);
        System.out.println("Date of what we want to print :" + paricularDate);

        LocalDate tommorow= today.plusDays(1);
        System.out.println("Tommorow date is : " + tommorow);

        LocalDate previous= today.minusWeeks(3);
        System.out.println("Date of 3 weeks back from today  :" +previous);

        LocalDate plus=today.plusMonths(5);
        System.out.println(plus);

        LocalTime time= LocalTime.now();
        System.out.println(time);
    }
}