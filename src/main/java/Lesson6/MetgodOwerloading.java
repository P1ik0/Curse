package Lesson6;

public class MetgodOwerloading {
    void show(int i1){
        System.out.println(i1);
    }
    void  show(boolean b1)
    {
        System.out.println(b1);
    }
    void  show(String s1)
    {
        System.out.println(s1);
    }
}

class MetgodOwerloadingTest{
    public static void main(String[] args) {
        MetgodOwerloading mO = new MetgodOwerloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Hello";
        mO.show(s);
    }
}