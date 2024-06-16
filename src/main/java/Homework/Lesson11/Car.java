package Homework.Lesson11;

import Homework.Lesson10.p1.p2.p3.C;

public class Car {
    public     String color;
    public    String engine;
    public   int numberOfDoors;
     Car(String color, String engine, int numberOfDoors)
     {
         this.color = color;
         this.engine = engine;
         this.numberOfDoors = numberOfDoors;
     }
     Car()
     {

     }
    public  void swapDoors(Car с, int number)
    {
        с.numberOfDoors = number;

    }
    public  void swapColor(Car c1, Car c2)
    {
        String color1= c1.color;
        c1.color = c2.color;
        c2.color = color1;

    }


}
class CarTest
{

    public static void main(String[] args) {


        Car c1 = new Car("red", "V6", 2);
        Car c2 = new Car("blue", "V8",1);
        Car c3 = new Car();
        c1.swapDoors(c1,4);
        System.out.println(c1.numberOfDoors);
        c1.swapColor(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);


    }
}