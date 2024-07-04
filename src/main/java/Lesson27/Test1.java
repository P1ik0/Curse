package Lesson27;

public class Test1 {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.a);
        System.out.println(a.b);
        a.abc();
        a.def();
    }
}
class Animal{
    int a = 5;
    static  int b = 10;
    void abc(){
        System.out.println("non-static met animal");
    }
   static void def(){
        System.out.println("static met animal");
    }
}
class Tiger extends  Animal{
    int a = 15;
    static int b =20;
    void abc(){
        System.out.println("non-static met tiger");
    }
    static void def(){
        System.out.println("static met tiger");
    }
}