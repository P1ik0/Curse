package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + '\n' + "Color: " + car.color + '\n' + "Balance: " + bA.balance);
    }

}

class  HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Anna";
        h.car = new Car3("red", "v12");
        h.bA = new BankAccount(12, 100.19);
        h.info();

    }
}
class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}
class  BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}