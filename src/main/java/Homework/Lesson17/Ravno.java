package Homework.Lesson17;


    public class Ravno {

        public static void ravenstvo(StringBuilder s1, StringBuilder s2) {
            int length1 = s1.length();
            int length2 = s2.length();

            if (length1 != length2) {
                System.out.println(false);
                return;
            }

            for (int i = 0; i < length1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(false);
                    return;
                }
            }

            System.out.println(true);
        }

        public static void main(String[] args) {
            StringBuilder s = new StringBuilder("Ananas");
            StringBuilder b = new StringBuilder("Ananas");
            Ravno.ravenstvo(s, b);
        }
    }

