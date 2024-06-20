package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        //длина массива
        int a = s1.length();
        System.out.println(a);

        // вызов елемента из масива по индексу
        char c1 = s1.charAt(3);
        System.out.println(c1);

        //indexOf = можно использовать как сhar так и String

        // выводит на каком инедексе находится этот елемне
        int i1 = s1.indexOf('t');
        System.out.println(i1);

        // выводит на каком индексе начинаются эти значения
        int i2  = s1.indexOf("vet");
        System.out.println(i1);


        // выводит индекс -1 если такого сивола не существует
        int i3  = s1.indexOf("Z");
        System.out.println(i3);

        // выводит еа каком индексе находится значения начиная с индекса (..)
        int i4 = s1.indexOf("a", 5);
        System.out.println(i4);

        //s1 начинается с "abc" = true
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        //String s1 начиная с 7 индекса  начинается с abc? = true
        boolean b2 = s1.startsWith("abc", 7);
        System.out.println(b2);

        //s1 заканчивается с abc? =  false.
        boolean b3 = s1.endsWith("abc");
        System.out.println(b2);




    }
}
