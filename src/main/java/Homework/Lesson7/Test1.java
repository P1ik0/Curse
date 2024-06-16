package Homework.Lesson7;

public class Test1 {
    public static void main(String[] args) {
        Employee EMP1 = new Employee(1,"Anna", 20, 15000, "IT");
        Employee EMP2 = new Employee(2, "Kolya", 47, 49000,"IT");
        EMP1.doubleSalary();
        EMP1.showinfo();
    }
}
