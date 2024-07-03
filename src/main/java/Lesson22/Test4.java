package Lesson22;

public class Test4 {
}

class Human2 {
        Human2(String n){
        this(n,null);
    }
    Human2(String n,String s){
        name = n;
        surname = s;
    }
    String name;
    String surname;
}

class Student2 extends Human2 {
    Student2(int i){super(("kolya"));};
    Student2(){
        this(5);
        System.out.println("hi");
    };
    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}