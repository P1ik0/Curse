package Lesson24;

public class Test4 {
    Jump j1 = new Human();
    Jump j2 = new Animal();
}
class Human implements Jump{
    @Override
    public void jumps() {
        System.out.println("Human jumps");
    }
}
class Animal implements  Jump{
    @Override
    public void jumps() {
        System.out.println("Animal jumps");
    }
}
interface Jump{
    void  jumps();
}
interface A2{void abc();}
interface b2 extends A2{void def();}

abstract class D implements b2{}