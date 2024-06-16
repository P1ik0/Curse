package Lesson6;

public class MetgodOwerloading2 {
    int sum(int i1, int i2){
        return  i1 + i2;
    }
    String sum(String s1, String s2)
    {
        return  s1 + s2;
    }
}
class MetgodOwerloading2Test{
    public static void main(String[] args) {
        MetgodOwerloading2 mo2 = new MetgodOwerloading2();
        int a = mo2.sum(5,7);
        System.out.println(a);
        String s = mo2.sum("hello my", " friends");
        System.out.println(s);
    }
    protected  void  sum(int a ){
        System.out.println("Hello");
    }
}
