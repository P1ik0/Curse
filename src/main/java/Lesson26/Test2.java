package Lesson26;

import java.util.ArrayList;

public class Test2
{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
    //        System.out.println(a);
        Number b = new Integer(10);
        int c = (int)b;

       String s1 = "50";
       String s2 = "true";
       String s3 = "3.14";
       boolean b1 = Boolean.parseBoolean(s2);
       double b2 = Double.parseDouble(s3);
       int i1 = Integer.parseInt(s1);
        System.out.println(s1);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
    }
}
