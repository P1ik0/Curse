package Lesson22;

public class Lesson5 {
}


class Human3 {

    Human3(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;
}

class Student3 extends Human3 {
    int course;

    Student3(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.surname);
    }
}
