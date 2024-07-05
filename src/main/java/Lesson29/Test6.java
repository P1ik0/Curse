package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
//        DateTimeFormatter d = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDateTime ldt = LocalDateTime.of(1,2,3,2,2);

        LocalDate date1 = LocalDate.parse("01 02 2005", f);

        System.out.println(date1);
    }
}
