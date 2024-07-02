package Lesson23;

public class A10 {
    String s1 = "Hi";
    static double d1= 3.14;
    int summa (int ...i){
int result = 0;
for (int a: i) {
    result += a;
}
return result;
    }
    static void abc(){
        System.out.println("static");
    }
}
class B10 extends A10{
//    String s1 =  super.s1 + ", friend!";
    int summa(int ...i){
        int result = super.summa(i);
        System.out.println("Summa " + result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}

