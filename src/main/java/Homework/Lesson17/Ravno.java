package Homework.Lesson17;

public class Ravno {

    public static void ravenstvo(StringBuilder s1, StringBuilder s2) {

        int i = 0;
        int y = 0;

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }
        if (s1.length() == s2.length()) {
            OUNER:
            while (i < s1.length()) {
                INNER:
                while (y < s2.length()) {
                    char newElement = s1.charAt(i);
                    char newElement2 = s2.charAt(y);
                    if (newElement == newElement2) {
                        i++;
                        y++;

                        if (i == s1.length() && y == s2.length()) {
                            System.out.println(true);
                            break OUNER;
                        }


                    } else {
                        System.out.println(false);
                        break OUNER;

                    }

                }

            }

        }
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Ananas");
        StringBuilder b = new StringBuilder("Ananas");
        Ravno.ravenstvo(s, b);


    }
}