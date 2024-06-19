package Homework.Lesson12;

import Lesson11.Student.*;

public class Student {
}

class StudentTest {

    public void ravno1(Lesson11.Student student, Lesson11.Student student2) {
        if (student.name.equals(student2.name) && student.course == student2.course && student.grade == student2.grade) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
    }

    public void ravno2(Lesson11.Student student, Lesson11.Student student2)
    {
        if (student.name.equals(student2.name))
        {
            if (student.course == student2.course   )
            {
                if (student.grade == student2.grade)
                {
                    System.out.println("Одинаковые оценки. имена. и курсы");
                }
                else
                {
                    System.out.println("Одинаковые курсы. имена");
                }
            } else
            {
                System.out.println("Одинаковіе имена");
            }

        }else if (student.course != student2.course && student.grade != student2.grade){
            System.out.println("имена разные. оценки разные. курсы разные");
        }
        else if (student.course == student2.course && student.grade == student2.grade)
        {
            System.out.println("имена разные. оценки одинаковые. курсы одинаковые");
        }
        else if (student.course == student2.course && student.grade != student2.grade)
        {
            System.out.println("имена разные. оценки разные. курсы одинаковые");
        }
        else
        {
            System.out.println("имена разные. оценки одинаковые. курсы разные");
        }


    }





public static void main(String[] args) {

    Lesson11.Student student = new Lesson11.Student("Anna", 1, 3.2);
    Lesson11.Student student2 = new Lesson11.Student("Anna", 1, 3.2);

    StudentTest studentTest = new StudentTest();
    studentTest.ravno1(student, student2);
    studentTest.ravno2(student, student2);

}
}