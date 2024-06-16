package Lesson4;

public class Car
{
    Car(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + '\n'+ "Мотор машины: " + engine);
    }
    String color;
    String engine;
}
class  CarTest
{
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("black", "V6");
    }
}
