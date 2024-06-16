package Lesson12;



public class Car {
    int engine;
    int numberOfDoors;

    Car(int engine, int numberOfDoors) {
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
}

class CarTest
{
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car(2,5);
        if (c1.engine > c2.engine) {
            if (c1.numberOfDoors > c2.numberOfDoors) {
                System.out.println("Мощность мотов и количесво дверей у 1 машины бльше");
            } else
                System.out.println("Мощность мотов у 1 больше а дверей меньше");
        }
        else
            System.out.println("moynosti motora y 1 dverey menshe");
    }
}