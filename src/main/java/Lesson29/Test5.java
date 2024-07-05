package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test5 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024,7,5);
        LocalDateTime ldt = LocalDateTime.of(1,2,3,2,2);
        System.out.println(ld.getDayOfWeek());
        DateTimeFormatter d1 = DateTimeFormatter.ISO_DATE;
        System.out.println(ld.format(d1));
    }
}
