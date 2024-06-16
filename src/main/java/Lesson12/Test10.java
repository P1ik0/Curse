package Lesson12;

public class Test10 {
    void  maksimum(int i1, int i2, int i3)
    {
        if (i1>i2 && i1 > i3)
        {
            System.out.println("maks - " + i1);
        }
        else if (i2 > i1 && i2 > i3)
        {
            System.out.println("maks - " + i2);
        }
        else
        {
            System.out.println("maks - " +  i3);
        }
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        t.maksimum(3, 5, 2);
    }
}
