package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("Делайте ставку");
            System.out.println("you lose");
            money -=10;

        }
        while (money >50);
    }
}
