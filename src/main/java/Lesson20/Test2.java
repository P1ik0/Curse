package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("prive");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
//        System.out.println();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");// выводит элемени под этим индексом
//        }
//        System.out.println(list.get(3));// выводит элемени под этим индексом

//        list.set(1, "!!!");

//        list.remove("poka");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");

        list.addAll(list2);//добавляем в конец элементы list2
//        list.addAll(1,list2);//добавляем в позицию 1 элементы list2


        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }
        list2.set(1,"Ivanov");
        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }


    }
}
