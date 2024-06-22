package Homework.Lesson17;

public class Ravno {

    public static void ravenstvo(StringBuilder s1, StringBuilder s2)
    {
        StringBuilder s3 = s1;
        StringBuilder s4 = s2;
        System.out.println( "s  и  б одинаковые ?: " + s3.equals(s4));

    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Ananas");
        StringBuilder b = new StringBuilder("Ananas");
        Ravno.ravenstvo(s,b);


    }
}
