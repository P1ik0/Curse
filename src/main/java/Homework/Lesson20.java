package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {


    static ArrayList abc(String... a) {
        ArrayList<String> list = new ArrayList<>();

        for (String l : a) {
            if (!list.contains(l))
            {
                list.add(l);
            }
        }
        Collections.sort(list);

       return list;
    }

    public static void main(String[] args) {
        Lesson20 l1 = new Lesson20();
        System.out.println( abc("a","e","c","s","b", "a"));
    }
}
