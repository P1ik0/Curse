package Homework.Lesson25;

public class Lesson25 {
    public static void main(String[] args) {

        Mechenosec m = new Mechenosec("Roby");
//        m.swim();
//        m.eat();
//        m.sleep();
        Speakable s = new Pingvin("Robby");
       Pingvin p = new Pingvin("dan");
//        s.speak();
        Animal a = new Lev("Rar");
//        a.eat();
//        a.sleep();
        Mammal m2 = new Lev("ROKY");
//        m2.rum();
//        m2.eat();
//        m2.speak();
//        m2.sleep();
        Speakable []array1 = new Speakable[]{s,m2,p};
        Animal [] array2 = new Animal[]{m2,p, a,m};

        for(Speakable sp :array1){
             if (sp instanceof Mammal) {
                    Mammal m3 = (Mammal)sp;
                System.out.println(((Mammal) sp).name);
                m3.speak();
                m3.rum();
                m3.eat();
                m3.sleep();

            }else if (sp instanceof Bird) {
                Bird b0 = (Bird) sp;
                System.out.println(((Bird) sp).name);
                b0.speak();
                b0.eat();
                b0.sleep();
                b0.fly();
            }
           else if (sp instanceof Lev){
                Lev l0 = (Lev)sp;
                System.out.println(l0.name);
                l0.speak();
                l0.eat();
                l0.sleep();
                l0.rum();

            }
            System.out.println("------------------------------------------------------");
        }
        for(Animal an :array2){
             if (an instanceof Lev){
                Lev l0 = (Lev)an;
                System.out.println(l0.name);
                l0.speak();
                l0.eat();
                l0.sleep();
                l0.rum();

            }

            if (an instanceof Mechenosec){
                Mechenosec m0 = (Mechenosec)an;
                System.out.println(((Mechenosec) an).name);
                m.sleep();
                m.eat();
                m.swim();
            } else if (an instanceof Mammal) {
                Mammal m3 = (Mammal)an;
                System.out.println(((Mammal) an).name);
                m3.speak();
                m3.rum();
                m3.eat();
                m3.sleep();

            }else if (an instanceof Bird) {
                Bird b0 = (Bird) an;
                System.out.println(((Bird) an).name);
                b0.speak();
                b0.eat();
                b0.sleep();
                b0.fly();
            }
            System.out.println("------------------------------------------------------");

        }


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