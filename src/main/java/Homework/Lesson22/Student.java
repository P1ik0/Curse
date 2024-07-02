package Homework.Lesson22;

public class Student {
   private StringBuilder name = new StringBuilder();
  private   int couse;
  private   int  grade;

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public  void setName(StringBuilder name)
    {

        if (name.length() > 3)
        {
            this.name = name;
        }

    }
    public int getCouse()
    {
        return couse;
    }
    public void  setCouse(int couse)
    {
        if (couse >0 && couse<5)
        {
            this.couse = couse;
        }
    }
    public int getGrade()
    {return grade;
    }
    public void setGrade(int g)
    {
        if (g>0 && g<11)
        {
            grade = g;
        }
    }
    public  void showInfo()
    {

        System.out.println( " " + "Name: "  + getName() + '\n' + " " + "Course: " + getCouse() + '\n' + " " + "Grade: " +  getGrade()  );
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student s = new Student();
        s.setCouse(4);
        s.setName(new StringBuilder("Anna"));
        s.setGrade(10);
        s.showInfo();
    }
}
