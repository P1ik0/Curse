package Lesson29;

import java.time.LocalDate;
import java.time.Period;

public class Test4 {
    static  void smena(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate data = nachalo;
        while (data.isBefore(konec)){
            System.out.println("Nastupi data " + data + " pora menat dejurnogo");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2024,7,5);
            LocalDate konec = LocalDate.of(2025,7,5);
            Period p = Period.ofMonths(2);
            smena(nachalo,konec,p);
    }
}
