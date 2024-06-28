package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hi");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            sb.append("Java");
        }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
    }
}
