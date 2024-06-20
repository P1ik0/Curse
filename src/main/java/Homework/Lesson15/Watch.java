package Homework.Lesson15;

public class Watch {

    public static void watch()
    {
        int hour  =0;

        OUTER: while (hour <6)

        {
            int minutes = -1;

          MIDDLE:  do {
              minutes ++;


                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
              int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minutes) {
                        continue MIDDLE;

                    }
                    System.out.println(hour + ":" + minutes + ":" + second);
                    second++;
                }

            }
            while (minutes<59);

            hour ++;
        }
    }

    public static void main(String[] args) {
        watch();
    }
}
