package Lesson15;

public class Test10 {
    public static void main(String[] args) {
        int chass = -1;
        OUTER:
        do {
            chass++;
            int minuta = 0;
            INNER:
            while (minuta < 60){
                if (minuta == 20){
                    continue OUTER;//заканчитай с данным итерешионом и переходи на следующий
                }
                System.out.println(chass + ":" + minuta);
                minuta++;}
            chass++;
        }while (chass <24);
        }
    }

