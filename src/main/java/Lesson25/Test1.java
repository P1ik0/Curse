//package Lesson25;
//
//public class Test1 {
//    public static void main(String[] args) {
//
//
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee emp3 = new Doctor();
//        Help_able h = new Teacher();
//        emp1.work();
//        emp2.work();
//        emp3.work();
//        h.help();
//        String s1 = null;
//        System.out.println(s1 instanceof  String);
////
////        Employee array2 [] = {emp1, emp2, emp3};
////        for ( Employee e :array2){
////            emp1.work();
////        }
//        System.out.println(emp1 instanceof Teacher);
//    }
//}
//
//abstract class Employee {
//    void sleep(){
//        System.out.println("Employee sleeps");
//    }
//  abstract void work();
//}
//class Teacher extends Employee implements Help_able{
//    @Override
//    void work() {
//        System.out.println("Teacher works");
//    }
//
//    @Override
//    public void help() {
//        System.out.println("Teacher Helps");
//    }
//}
//class Driver extends Employee implements Help_able{
//    @Override
//    void work() {
//        System.out.println("Drivers works");
//    }
//    @Override
//    public void help() {
//        System.out.println("Driver Helps");
//    }
//}
//class Doctor extends Employee implements Help_able{
//    @Override
//    void work() {
//        System.out.println("Doctor works");
//    }
//    @Override
//    public void help() {
//        System.out.println("Doctor Helps");
//    }
//}
//interface Help_able{
//    void help();
//}