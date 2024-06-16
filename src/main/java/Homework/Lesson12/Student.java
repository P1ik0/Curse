package Homework.Lesson12;
import Lesson11.Student.*;
public class Student {
}
class StudentTest{

   public  void ravno1(Student student, Student student2)
   {
       if (student.equals(student2))
       {
           System.out.println("равны");
       }
       else
       {
           System.out.println("не равны");
       }
   }

    public static void main(String[] args) {

        Lesson11.Student student = new Lesson11.Student("Anna", 12,6.3);
        Lesson11.Student student2 = new Lesson11.Student("Oleg",1,3.2);
    }
}