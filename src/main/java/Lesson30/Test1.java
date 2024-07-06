//package Lesson30;
//
//import java.util.ArrayList;
//
//public class Test1 {
//
//
//}
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    Student(String name, char sex, int age, int course, double avgGrade){
//        this.age = age;
//        this.name = name;
//        this.avgGrade = avgGrade;
//        this.course = course;
//        this.sex = sex;
//    }
//}
//class  StudentInfo{
//    void printStudent(Student st){
//        System.out.println("Name Student: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
//                ", Course: " + st.course  + ", AvgGrade: " + st.avgGrade);
//    }
//    void printStudentsOwerGrade(ArrayList<Student> al, double avgGrade){
//        for (Student s: al)
//        {
//            if (s.avgGrade > avgGrade){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade){
//        for (Student s: al)
//        {
//            if (s.avgGrade < avgGrade){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsOwerAge(ArrayList<Student> al, int age){
//        for (Student s: al)
//        {
//            if (s.age > age){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age){
//        for (Student s: al)
//        {
//            if (s.age < age){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsBySex(ArrayList<Student> al, char sex){
//        for (Student s: al)
//        {
//            if (s.sex == sex){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> al, double avgGrade, int age, char sex){
//        for (Student s: al)
//        {
//            if (s.avgGrade > avgGrade ){
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Anna", 'f', 20, 2, 7.3);
//        Student st3 = new Student("Sidor", 'm', 21, 3, 9.1);
//        Student st4 = new Student("Mariya", 'f', 23, 4, 6.3);
//        Student st5 = new Student("Kolya", 'm', 19, 1, 9.3);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo si = new StudentInfo();
//        si.printStudentsOwerGrade(list, 8.5);
//        System.out.println("-------------------------------------------------------------------");
//        si.printStudentsUnderGrade(list, 9);
//        System.out.println("-------------------------------------------------------------------");
//        si.printStudentsOwerAge(list,21);
//        System.out.println("-------------------------------------------------------------------");
//
//
//    }
//}
//
//
//
//
