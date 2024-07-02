package Lesson20.Dop;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <String> all = new ArrayList <String> ();
        all.add("one");
        all.add("two");
        all.add("tree");
        all.add("four");
        all.add("five");
        System.out.println(all);
        ArrayList <String> all2 = new ArrayList<>();
        all2.add("one");
        all2.add("two");
        all2.add("tree");
        all2.add("four");
        all2.add("ten");

        all.removeAll(all2);//уддаляем все элементы, которые есть во втором списке
        all.retainAll(all2);// сохраняем только те элементы, которые есть во втором списке
        System.out.println(all);
    }
}
