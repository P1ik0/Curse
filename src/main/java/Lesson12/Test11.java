package Lesson12;

public class Test11 {
    void  abc()
    {
        String  str;
        int a = 9;
        if (a>=10)
            str = "Hello";
        else if (a<10)
            str = "bye";
        else  {
            str = null;
        }
        System.out.println(str);

    }


    public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int maximum = (a > b ? a : b);// ( а больше б) ? - если а больше б то a, если нет то b
      System.out.println(maximum);


    }
}
