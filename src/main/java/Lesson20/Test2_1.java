package Lesson20;

import java.util.ArrayList;

public class Test2_1 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("prive"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
//
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list.addAll(list2);//добавляем в конец элементы list2
//

        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");//передаем второй элемент list2
        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        list.clear();
        System.out.println();
        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }


    }
}
