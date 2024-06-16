package Homework.Lesson8;

public class zadacha {

   public static  final double Pi = 3.14;

    public double ploshaKruga(double radiuse)
    {
        return Pi * radiuse  * radiuse;
    }
    public  static  double  dlinaOkruha(double radiuse)
    {
        return 2 * Pi * radiuse;

    }
 public    void radiuse3(double radiuse)
    {
        System.out.println("Radius: " + radiuse + '\n' + "Plosha Kruga: " + ploshaKruga(radiuse) + '\n' + "Dlina OKruga: " + dlinaOkruha(radiuse)  );
    }
}
class zadachaTest
{
    public static void main(String[] args) {
        zadacha v1 = new zadacha();
        System.out.println(zadacha.dlinaOkruha(10.6));
        System.out.println(v1.ploshaKruga(10.6));
        v1.radiuse3(10.6);

    }
}
