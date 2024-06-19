package Lesson13;

public class Employee {
    public static void main(String[] args) {
        int daynedely = 1;
        switch (daynedely) { //byte, short, int, char, String
            case 1:

            case 2:

            case 3:

            case 4:
            case 5:
                System.out.println("Work to 18:00");
                break;
            case 6:
                System.out.println("Work to 16:00");
                break;
            case 7:
                System.out.println("Net rabotu");
                break;
            default:
                System.out.println("Takago dna net");
        }
    }
}
