package Lesson24;


public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_Able s = new Driver();
        Emplopyee e = new Driver();
        h.help();
        s.swim();
        h.tushitPojar();
    }
}


class Emplopyee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Reshat");
    }

    void sleep() {
        System.out.println("sleep");
    }

}

class Teacher extends Emplopyee implements Help_able{
    int kolichestvoUchenikiv;

    void teach() {
        System.out.println("teach");
    }
    public void help(){
        System.out.println("teacher helps");
    }
    public void tushitPojar(){
        System.out.println("teacher tushitPojar");
    }
}

class Driver extends Emplopyee implements Swim_Able, Help_able{
    String nameCar;
    public void help(){
        System.out.println("drivers helps");
    }
    public void tushitPojar(){
        System.out.println("drives tushitPojar");
    }
   public void swim(){
        System.out.println("driver swim");
    }
    void drive() {
        System.out.println("drive");
    }
}
interface Help_able{
    void help();
    void tushitPojar();
}
interface Swim_Able{

    void swim();
}
