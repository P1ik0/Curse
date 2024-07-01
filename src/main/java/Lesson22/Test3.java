package Lesson22;

public class Test3 {
    void doublezap(Emplopyee e)
    {
        e.salary = e.salary +100;
    }
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.name = "Ivan";
        d.age = 50;
        d.experience = 23;
        d.eat();
        d.hill();
    }
}

class Emplopyee{
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat()
    {
        System.out.println("Reshat");
    }
    void sleep() {
        System.out.println("sleep");
    }
}
class Doctor extends Emplopyee{



    void hill(){
        System.out.println("hill");
    }

    class Xirurg extends  Doctor{
        String Skalpel;
        void operachiya(){}
    }
    class dontist extends  Doctor{

    }




}
