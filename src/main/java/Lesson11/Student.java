package Lesson11;

public class Student {
     public String name;
  public   int course;
    public  double grade;
  public   Student(String name, int course, double grade)
    {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
public static void swap(Student s1, Student s2)
{
    Student s3 = s1;
    s1 = s2;
    s2 = s3;

}
public static void changeName(Student s1)
{
    s1.name = "Petya";
}
    public static void main(String[] args) {

        Student student = new Student("Anna", 1, 4.0);
        Student student2 = new Student("Anna", 1,4.0);
     changeName(student2);
        System.out.println(student2.name);
        }
}
