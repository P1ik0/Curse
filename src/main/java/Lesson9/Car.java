package Lesson9;

public class Car {


    int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;
    int z = 10;



     String color;
   public  static   int ab = 10;
     String engine; // instants variable
     static  int count; // static variable
    public Car(String color, String engine)
     {

       this.color = color;
       this.engine = engine;
     }
     public  void  showColor()
     {
         System.out.println("Color car: " + color);
     }


    public static void main(String[] args) {
        Car c = new Car("red", "V8");
       int a = 10;

    }
}
