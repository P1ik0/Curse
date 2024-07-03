package Lesson26;

public class Test6 {
    int a  =3;
    Test6(){
        a = 4;
    }
    {
        a =5;
    }

//    public static void main(String[] args) {
//        Test6 t  = new Test6();
//        System.out.println(t.a);
//    }
}
class A{
    static final int b;
   static {b = 10;}
}
class B {
    static int d;
    static int c;
    static final int e = 1;
    static final int f;
    static {
        f =0;
    }
}

class   C{
    String s = "ok";
    {
        System.out.println(s);
    }
    static  int i = 0;
    static {
        System.out.println(i);
    }
    static {i=i+1;
        System.out.println("это конструктор");}

    public static void main(String[] args) {
        System.out.println("priv");
        C c = new C();
    }
}

class D{
    static {
    }
    static void abc(int a){
        System.out.println(a + " ");
    }
    D(){
        abc(5);
    }
    static {new D();}
    {abc(8);}

    public static void main(String[] args) {

    }
}