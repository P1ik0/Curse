package Homework.Lesson6;

public class Owerloading {
    int summ()
    {
        int result = 0;
        System.out.println(result);
        return result;
    }
    int summ(int a)
    {
        int result = a;
        System.out.println(result);
        return result;

    }
    int summ(int a, int b)
    {
        int result = a + b;
        System.out.println(result);
        return result;
    }
    int summ(int a, int b, int c)
    {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }
    int summ(int a, int b, int c, int d)
    {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }

}
class OwerloadingTest
{
    public static void main(String[] args) {
        Owerloading ow = new Owerloading();
        ow.summ();
        ow.summ(1);
        ow.summ(1,2);
        ow.summ(1,2,3);
        ow.summ(1,2,3,4);
    }
}