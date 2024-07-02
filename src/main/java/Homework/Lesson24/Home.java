package Homework.Lesson24;

public class Home {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Roby");
        m.swim();
        m.eat();
        m.sleep();
        Speakable s = new Pingvin("Robby");
        s.speak();
        Animal a = new Lev("Rar");
        a.eat();
        a.sleep();
        Mammal m2 = new Lev("ROKY");
        m2.rum();
        m2.eat();
        m2.speak();
        m2.sleep();

    }
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
        System.out.println("Animal name: " + name);
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
        super(name);
       this.name = name;
    }
    public void sleep(){
        System.out.println("Всегда интересено смотреть как спят рыбы");
    }
    abstract void swim();

}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;

    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;

    }
    abstract void rum();

}

interface Speakable {
   default void speak()
    {
        System.out.println("somebody speaks");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;

    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба которая быстро плаваает");
    }

    @Override
    void eat() {
        System.out.println("Мечееносец не хичщная рыба. она ест рыбий корм)");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;

    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят притулившись к друг другу");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеет летать");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи ");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;

    }

    @Override
    void eat() {
        System.out.println("Лев как любой хищник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void rum() {
        System.out.println("Лев не самая быстрая кошка");
    }
}
class  Test1 {

}