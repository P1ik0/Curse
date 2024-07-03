package Lesson25;


public class Test3 {
    public static void main(String[] args) {
        Emplopyee e1 = new Doctor();
        Emplopyee e2 = new Teacher();
        Emplopyee e3 = new Driver();
        Emplopyee e4 = new Emplopyee();

        Emplopyee [] array = {e1, e2, e3, e4 };

        for (Emplopyee e :array){
            if (e instanceof Driver){
                System.out.println(((Driver)e).nameCar);
                ((Driver)e).drive();
            }

        }


    }
}
interface Help_able{
    void help();
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

class Teacher extends Emplopyee {

    int kolichestvoUchenikiv;

    void teach() {
        System.out.println("teach");
    }

}

class Driver extends Emplopyee  {
    String nameCar  = "bmw ";


    void drive() {
        System.out.println("drive");
    }
}
class Doctor extends Emplopyee implements  Help_able{
    @Override
    public void help() {
        System.out.println("Doctor Helps");
    }

    String specilizaciya = "xirurg";
    void lechit(){
        System.out.println("hill");
    }
}