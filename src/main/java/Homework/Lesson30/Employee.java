package Homework.Lesson30;


import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name, departament;
    int salary;
    Employee(String name, String departament, int salary){
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
}
class TestEmployee{
    void printEmployee(Employee e){
        System.out.println(e.name + " " + e.departament + " " + e.salary);

    }
    void filtaciyaRabotnikov(Predicate <Employee> t, ArrayList <Employee> al){
        for (Employee e: al){
            if (t.test(e)){
                printEmployee(e);

            }
        }



    }
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Anna", "IT", 3000);
        Employee e2 = new Employee("HR", "HR", 2000);
        Employee e3 = new Employee("Kolya", "IT", 4000);
        Employee e4 = new Employee("Elena", "QA", 250);
        Employee e5 = new Employee("Ivan", "IT", 3500);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        TestEmployee te = new TestEmployee();

        System.out.println("--------------------------------------");
        te.filtaciyaRabotnikov( e -> e.departament.equals("IT") &&  e.salary >200, list);
        System.out.println("--------------------------------------");
        te.filtaciyaRabotnikov( e -> e.name.startsWith("E") && e.salary!=450,list  );
        System.out.println("--------------------------------------");
        te.filtaciyaRabotnikov( e -> e.name.equals(e.departament), list  );
        System.out.println("--------------------------------------");



    }
}