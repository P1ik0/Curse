package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("poka");
        list.add(sb1);
        list.add(new StringBuilder("prive"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("Hello"));
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.toString());
        System.out.println(list.contains(sb1));

    }
}
