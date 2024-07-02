package Homework.Lesson22;

public class Animal {
      Animal(){
        System.out.println("i am animal");
    }
    int eyes;
     void eats(){
        System.out.println("Animal eats");
    }
     void drink ()
    {
        System.out.println("Animal drinks");
    }
}
class pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;
     void run(){
        System.out.println("Pet runs");
    }
     void jump()
     {
         System.out.println("pets jumps");
     }
    public pet(){
        System.out.println("i am pet");
        eyes = 2;
    }
}
class Dog extends pet
{
    public Dog(String name){
        this.name = name;
        System.out.println("i am dog and my name is: " + name);
    }
    void play()
    {
        System.out.println("dog plays");
    }
}
class Cat extends pet{
    public Cat(String name){
        this.name = name;
        System.out.println("i am cat and my name is: " + name);
    }
    void sleep()
    {
        System.out.println("cat sleeps");
    }
}
class  Test{
    public static void main(String[] args) {
        Dog d1 = new Dog("Rob");
        Cat c1 = new Cat("Sleps");
        System.out.println(d1.paw);
        c1.sleep();
    }
}