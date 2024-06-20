package Homework.Lesson14;

public class Watch {
  public static void watch()
  {
     OUTER: for (int hour = 0; hour <=6; hour ++)
      {

          MIDDLE:  for (int minutes = 0; minutes <60; minutes ++)
          {

             if (hour >1 && minutes % 10 == 0){
                  break OUTER;
              }
            INNER:  for (int second = 0; second <60; second++){
                  if (second* hour > minutes)
                  {
                      continue MIDDLE;
                  }
                  System.out.println(hour + ":" + minutes + ":" + second);
              }
          }
      }
  }

    public static void main(String[] args) {
        watch();
    }
}
