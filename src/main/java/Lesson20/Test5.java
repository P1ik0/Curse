package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("prive"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("Hello"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String("poka")));//индекс элемента пока первого
        System.out.println(list.lastIndexOf(new String("poka")));// индекс элемента пока последнего
        System.out.println(list.size());// размер листа
        System.out.println(list.isEmpty());//tue - пуст false - не пуст
        System.out.println(list.contains("poka")); // лист содержит обьект пока? тру



    }
}
