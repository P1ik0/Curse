package Homework.Lesson7;


public class Employee {
    int id;
  public   String surname;
    int age;
   private double salary;
    String departament;
    Employee(int id2, String surname2, int age2, double salary2,String department2){
        id  = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = department2;
    }

     Employee(int id1)
    {
        id  = id1;

    }
    public Employee(String surname2)
    {
        surname = surname2;

    }
    private Employee(double salary2)
    {
        salary = salary2;
    }
    double doubleSalary()
    {
        salary*=2;
        return salary;
    }
    void  showinfo(){
        System.out.println("ID: " + id + '\n' + "Surname: " + surname + '\n' + "age: " + age + '\n' + "departament: " + departament + '\n' + "salary: " + salary);
    }
    public void getid(int id)
    {
        System.out.println(id);
    }
    public void getsurname(String surname)
    {
        System.out.println(surname);
    }
    public void  getsalary(double salary)
    {
        System.out.println(salary);
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee EMP1 = new Employee(1,"Anna", 20, 15000, "IT");
        Employee EMP2 = new Employee(2, "Kolya", 47, 49000,"IT");
        EMP1.doubleSalary();
        EMP1.showinfo();


    }
}