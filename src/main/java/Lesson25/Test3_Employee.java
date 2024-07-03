package Lesson25;

public class Test3_Employee {

}

class Emplopyee1 {
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

class Teacher1 extends Emplopyee {

    int kolichestvoUchenikiv;

    void teach() {
        System.out.println("teach");
    }

}

class Driver1 extends Emplopyee  {
    String nameCar;


    void drive() {
        System.out.println("drive");
    }
}
class Docrot1 extends Emplopyee {
    String specilizaciya;

    void lechit() {
        System.out.println("hill");
    }
}
