package Lesson26;

public class Test7 {
    public static void main(String[] args) {
        Animal a = new Animal();
    }
}
class Animal{
    Animal(){
        System.out.println("Kon of anim");
    }
    static {
        System.out.println("static of animal");
    }
    {
        System.out.println( "non static ini of animal");
    }
}
class Mammal extends Animal{
    Mammal(){
        System.out.println("Kon of mammal");
    }
    static {
        System.out.println("static of mammal");
    }
    {
        System.out.println( "non static ini of mammal");
    }
}
class Lion extends Mammal{

    Lion(){
        System.out.println("Kon of lion");
    }
    static {
        System.out.println("static of lion");
    }
    {
        System.out.println( "non static ini of lion");
    }
}

