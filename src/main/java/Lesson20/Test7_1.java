package Lesson20;

import java.util.ArrayList;
import  java.util.Iterator;
import  java.util.ListIterator;
public class Test7_1 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";

        ArrayList<String> list1 = new ArrayList<>();

        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);


        ListIterator<String> it2 = list1 .listIterator();
        while (it2.hasNext())
        {
            it2.next();
            it2.remove();
        }


    }
}
