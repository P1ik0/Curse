package Lesson6;

public class Employee {
    Employee(int id2, String surname2, int age2)

    {
        this(id2, surname2,age2, 0.0, null);


    }
    Employee(String surname3, int age3)
    {
        this(0, surname3,age3, 0.0, null);
    }
    Employee(int id4, String surname4, int age4, double salary4, String departament4)
    {
        id = id4;
        surname = surname4;
        age = age4;
        salary  = salary4;
        departament = departament4;
    }
    int id;
    String surname;
    int age;
    double salary;
    String departament;
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Koval",26);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 45);
        System.out.println(emp2.departament);
        Employee emp3 = new Employee(2, "Sidorov", 40, 1304, "It");
        System.out.println(emp3.departament);
    }
}
