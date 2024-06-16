package Homework.Lesson4;

public class Student{
    int Studid;
    String name;
    String surnname;
    int course;
    double avgGradeMaths;
    double avgGradeEconomics;
    double avgGradeLanguage;


}
class StudentTest{
    public static void main(String[] args) {
        Student student1 =  new Student();
        student1.Studid = 1;
        student1.name = "Anna";
        student1.surnname = "Kavila";
        student1.course = 1;
        student1.avgGradeMaths = 84.2;
        student1.avgGradeEconomics = 74.1;
        student1.avgGradeLanguage= 89.3;
        System.out.println("Student id: " + student1.Studid);
        System.out.println("Name: " + student1.name);
        System.out.println("Surname: " + student1.surnname);
        System.out.println("Year Study: " + student1.course);
        System.out.println("avg Grade Maths: " + student1.avgGradeMaths);
        System.out.println("avg Grade Economics: " + student1.avgGradeEconomics);
        System.out.println("avg Grade Language: " + student1.avgGradeLanguage);
        System.out.println("avg Grade : " +  (student1.avgGradeLanguage + student1.avgGradeMaths + student1.avgGradeEconomics)/3);
    }
}