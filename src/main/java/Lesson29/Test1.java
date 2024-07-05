package Lesson29;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalTime.now());

        LocalDate l1 = LocalDate.of(2021,1,12);
        System.out.println(l1);

        LocalTime l3 = LocalTime.of(11,2);
        System.out.println(l3);

        LocalDateTime l4 = LocalDateTime.of(1,2,3,2,2);
        System.out.println(l4);
        l1 = l1.plusDays(2);
        System.out.println(l1);
        l1 = l1.minusDays(15).minusMonths(1);
        System.out.println(l1);

    }
}
