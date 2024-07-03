package Lesson26;

public class Test4 {
    void abc(String s ){
        System.out.println("A");
    }
    void abc(String ...s ){
        System.out.println("B");
    }
    void abc(Object s ){
        System.out.println("C");
    }
    void abc(String s1, String s2 ){
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ad");
    }

    static void def(Long a ){
        System.out.println("E");
    }
    static void def(Long ...a ){
        System.out.println("F");
    }
    static void def(long a ){
        System.out.println("G");
    }
    static void def(Object a ){
        System.out.println("H");
    }
    static void def(Integer a ){
        System.out.println("I");
    }




}
