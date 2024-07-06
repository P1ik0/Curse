//package Lesson30;
//
//import java.util.ArrayList;
//
//public class Test2 {
//}
//
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
//  static  class  StudentInfo{
//            void printStudent(Student st){
//        System.out.println("Name Student: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
//                ", Course: " + st.course  + ", AvgGrade: " + st.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student> al, StudentChecks sc){
//        for (Student s: al)
//        {
//            if (sc.test(s)){
//                printStudent(s);
//            }
//        }
//
//    }}
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
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
//
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();
//
//        si.testStudents(list, fsog);
//        System.out.println("----------------------------------------");
//        si.testStudents(list, fsug);
//        System.out.println("----------------------------------------");
//        si.testStudents(list, fsbs);
//        System.out.println("----------------------------------------");
//        si.testStudents(list, fsoa);
//        System.out.println("----------------------------------------");
//        si.testStudents(list, fsua);
//        System.out.println("----------------------------------------");
//        si.testStudents(list, fsmc);
//
//
//    }
//}
//interface StudentChecks{
//    boolean test(Student s);
//
//}
//class FindStudentsOverGrade implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade> 8.5;
//    }
//}
//class FindStudentsUnderGrade implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade< 9;
//    }
//}
//class FindStudentsOverAge implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return s.age> 25;
//    }
//}
//class FindStudentsUnderAge implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return s.age<27;
//    }
//}
//class FindStudentsBySex implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return s.sex=='m';
//    }
//}
//class FindStudentsMixCondition implements StudentChecks{
//    @Override
//    public boolean test(Student s) {
//        return (s.avgGrade > 7.2) && (s.age<21) && (s.sex=='f');
//    }
//}
//
//
