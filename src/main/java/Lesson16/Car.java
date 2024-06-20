package Lesson16;

public class Car {
    String color;
    String engine;
    Car(String color, String engine)
    {
        this.color = color;
        this.engine =engine;

    }
    final static int a =5;
    public Car abc(String color) {
        Car c10 = new Car(color, "V8");
        return  c10;
    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        c.abc("Black");
        System.out.println(c.color);
    }
}
