package Lesson26;

public class Test5 {
    Test5() {
        System.out.println("this kondtruktor1 ");
    }

    Test5(int a) {
        this();
        System.out.println("this kondtruktor2 ");
    }

static
    {
        System.out.println("Eto init blok1");//вызывается каждый раз когда создаётся новый обьект


    }

    {
        System.out.println("Eto init blok2");


    }


    public static void main(String[] args) {
        Test5 t = new Test5();

    }
}
