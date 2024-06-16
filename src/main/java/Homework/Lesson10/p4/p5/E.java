package Homework.Lesson10.p4.p5;

public class E {
    int a;
    int b;
   public String e = "Ananas";

    public void matematica(int a, int b)

    {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }
}
class eTest
{
    public static void main(String[] args) {
        E e1 = new E();
        e1.matematica(3,2);
    }
}

