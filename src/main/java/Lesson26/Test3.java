package Lesson26;

public class Test3 {
    void abc(int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }
    void  def(Object o){
        System.out.println("Object");
    }
    void  def(String o){
        System.out.println("String");
    }
    void ghi(int a, int b){
        System.out.println("hello1");
    }
    void ghi(long a, long b){
        System.out.println("hello2");
    }

    void ghi(Integer a, Integer b){
        System.out.println("hello3");
    }

    void ghi(int ...q){
        System.out.println("hello4");
    }


    public static void main(String[] args) {
        Test3 t = new Test3();

        t.def(new StringBuilder("hello"));
    }



}
