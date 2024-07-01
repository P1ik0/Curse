package Lesson22;

import java.util.Objects;

public class Human {
    String name = "Oleg";
    static int  salary = 150;

 public    void work()
    {
        System.out.println("work");
    }
 public   static void rest()
    {
        System.out.println("otdihat");
    }

}
class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }

}
