package Lesson16;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты\n" +
                    "лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
         if (c1 != ','&& c1 != ':' && c1 != ' '  && c1 != '.' && c1 == c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.println(c1);
         }
        System.out.println();
        }
    }

