//package Lesson23;
//
//
//public class Test2 {
////    public  Object abc(){
////        return new int []{4,3,5};
////    }
//
//    public static void main(String[] args) {
////        Doctor d = new Doctor();
////        Teacher t = new Teacher();
////        Driver dr = new Driver();
////        Emplopyee e = new Emplopyee();
//
//        Employee emp1 = new Doctor(); // доктор - это работник
//        Employee emp2 = new Teacher();//учитель это работник
//        Employee emp3 = new Driver();//учитель это работник
//        // любмая переменная может ссылаться на сап класс, но не наоборот
//
//        Xirurg x = new Xirurg();
//        Doctor d2 = new Xirurg(); // любой доктор это хирург, но не наоборот. так как не любой доктор это хирург
//
//        Employee ep2 = new Xirurg();
//
//        System.out.println(emp1.salary);
//        System.out.println(emp1.name);
//        System.out.println(emp1.salary);
//        System.out.println(emp1.experience);
//
//        System.out.println(d2.age);
//
//    }
//    }
//
//
//class Employee {
//    double salary = 100;
//    String name = "koliya";
//    int age;
//    int experience;
//
//    void eat()
//    {
//        System.out.println("Reshat");
//    }
//    void sleep() {
//        System.out.println("sleep");
//    }
//}
//class Doctor extends Employee {
//    void lechit(){
//        System.out.println("lechit");
//    }
//}
//class Xirurg extends Doctor{
//    int skalpel;
//    void oper(){
//        System.out.println("operacia");
//    }
//}
//
//class Teacher extends Employee{
//    void teach(){
//        System.out.println("teach");
//    }
//}
//class Driver extends Employee{
//    void drive(){
//        System.out.println("drive");
//    }
//}