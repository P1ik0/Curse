package Homework.Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson29 {
    public static void main(String[] args) {
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm  ");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
        LocalDateTime l1 = LocalDateTime.of(2016, 1, 1,9,00);
        LocalDateTime l2 = LocalDateTime.of(2016, 2, 3,9,00);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600 );
        Lesson29 l = new Lesson29();
        l.smena(l1,l2,p,d);

    }

    void smena(LocalDateTime l1, LocalDateTime l2, Period p, Duration d){
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm  ");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
        while (l1.isBefore(l2)){
            System.out.println("Работаем с: " + l1.format(d1));
            l1 = l1.plus(p);
            System.out.println("До: " + l1.format(d1));
            System.out.println("Отдыхаем с: " +l1.format(d2));
           l1 =  l1.plus(d);
            System.out.println("До: " + l1.format(d2));


        }
    }
}
