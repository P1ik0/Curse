package Homework.Lesson13;

public class Month {
    public void mon(int mont)
    {
        switch (mont)
        {
            case 1,3,5,7,8,10,12:
                System.out.println("31 days");
                break;
            case 4,6,9,11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("Неверный месяц");
        }

    }
}
    class MonthTest{
        public static void main(String[] args) {
            Month m1 = new Month();
            m1.mon(2);
        }
    }
