package Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
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
    static  class  StudentInfo{
        void printStudent(Student st){
            System.out.println("Name Student: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
                    ", Course: " + st.course  + ", AvgGrade: " + st.avgGrade);
        }

        void testStudents(ArrayList<Student> al , Predicate<Student> t){
            for (Student s: al)
            {
                if (t.test(s)){
                    printStudent(s);
                }
            }

        }}
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 20, 2, 7.3);
        Student st3 = new Student("Sidor", 'm', 21, 3, 9.1);
        Student st4 = new Student("Mariya", 'f', 23, 4, 6.3);
        Student st5 = new Student("Kolya", 'm', 19, 1, 9.3);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        for (Student s:list){System.out.println(s.name);}
            System.out.println("----------------------------------");
            list.removeIf(student -> student.name.endsWith("a"));
        for (Student s:list){System.out.println(s.name);}
        System.out.println("----------------------------------");

//
//        si.testStudents(list, (Student st) ->{return st.avgGrade > 8.5;});
//        System.out.println("----------------------------------------");
//        si.testStudents(list, st ->  st.avgGrade < 9   );
//        System.out.println("----------------------------------------");
//        si.testStudents(list, (Student st) -> {return  st.age > 25;});
//        System.out.println("----------------------------------------");
//        si.testStudents(list, (Student st) -> {return  st.age < 27;});
//        System.out.println("----------------------------------------");
//        si.testStudents(list,(Student st) -> {return  st.sex == 'm';} );
//        System.out.println("----------------------------------------");
//        si.testStudents(list,(Student st) -> {return  st.avgGrade < 7.2 && st.age < 23 && st.sex == 'f' ;} );


    }
}
