package Homework.Lesson6;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    double averageMark;
    double avgGradeEconomics;
    double avgGradeLanguage;
    Student(int id2, String name2, String surname2, int course2, double averageMark2, double avgGradeEconomics2, double avgGradeLanguage2 )
    {
        id = id2;
        name = name2;
        surname = surname2;
        course = course2;
        avgGradeEconomics = avgGradeEconomics2;
        avgGradeLanguage = avgGradeLanguage2;
//        System.out.println("Id:" + id + " " + "Name: " + name + " " + "Surname: " + surname + " " + " Course: " + course + " " + "avgM: " + " " + averageMark + " " + "avgE: " +  avgGradeEconomics + " " + "avgL: " + avgGradeLanguage);
    }
    Student(int id2,String name2, String surname2, int course2)
    {
        this(id2, name2, surname2,course2,0.0,0.0,0.0);
    }
    Student()
    { }
    void avgGrade(){
        double avg = (avgGradeLanguage + averageMark + avgGradeEconomics)/3;
        System.out.println(avg);
    }
}
class StudentTest
{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(1,"Anna","Koval",1);
        Student st3 = new Student(2,"Anna", "Koval",2,85.3,32.4,21.1);
        st1.avgGrade();
        st2.avgGrade();
        st3.avgGrade();

    }
}



