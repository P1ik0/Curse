package Lesson13;

public class Test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        switch (st1.grade)
        {
            case 2:
                System.out.println("Stupid 2");
                break;
            case 3:
                System.out.println("Student 3");
                System.out.println("     ");
                break;
            case 4:
                System.out.println("Student 4");
                break;
            case 5:
                System.out.println("Student 5");
                break;
            default:
                System.out.println("Mark error");
        }

    }
}

