package Lesson15;

public class Test11 {
    public static void main(String[] args) {
       OUTER: for (int chass =0; chass <24; chass++)
        {
            int minuta = 0;
          INNER:  while (minuta<60){
                System.out.println(chass + ":" + minuta);
                minuta++;
            }
        }
    }
}
