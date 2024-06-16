package Homework.Lesson8;

public class Vosvrat {
    static int a;
    static int b;
    static int c;

    static int umna(int a, int b, int c) {
        return a * b * c;
    }

    static void delit(int a, int b) {
        System.out.println(a / b + "  " + a % b);
    }
}

 class VosvratTest
 {
     public static void main(String[] args) {
         Vosvrat v1 = new Vosvrat();
         System.out.println( v1.umna(2,3,4));
         Vosvrat.delit(9,2);

     }
     }
