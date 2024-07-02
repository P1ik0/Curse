package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee e = new Teacher1();
        e.sleep();
    }
}

class Eda {
};

class Frukti extends Eda {
}

class Employee {
    double salary = 100;
    String name = "koliya";
    int age;

    static void sleep() {
        System.out.println("slepp rabotnik");
    }


  public   Eda eat() {
        System.out.println("Kushaet rabotnil");
        Eda e = new Eda();
        return e;

    }


}

class Teacher1 extends Employee {
    int kolichestvoUchenikov;
    @Override
   public Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    void teach() {
        System.out.println("teach");
    }

    static void sleep() {
        System.out.println("slepp teacher");
    }

}