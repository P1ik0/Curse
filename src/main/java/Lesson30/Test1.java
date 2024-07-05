package Lesson30;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

    }

}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name, char sex, int age, int course, double avgGrade){
        this.age = age;
        this.name = name;
        this.avgGrade = avgGrade;
        this.course = course;
        this.sex = sex;
    }
}
class  StudentInfo{
    void printStudent(Student st){
        System.out.println("Name Student: " + st.name + "sex: " + st.sex + "age: " + st.age +
                " Course: " + st.course  + " AvgGrade: " + st.avgGrade);
    }
    void printStudentsOwerGrade(ArrayList<Student> al, double avgGrade){
        for (Student s: al)
        {
            if (s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade){
        for (Student s: al)
        {
            if (s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentsOwerAge(ArrayList<Student> al, int age){
        for (Student s: al)
        {
            if (s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> al, int age){
        for (Student s: al)
        {
            if (s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentsBySex(ArrayList<Student> al, char sex){
        for (Student s: al)
        {
            if (s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> al, double avgGrade, int age, char sex){
        for (Student s: al)
        {
            if (s.avgGrade > avgGrade ){
                printStudent(s);
            }
        }
    }
}




