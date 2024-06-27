package Homework.Lesson18;

public class Show {
    public void showArray(String[][] array) {
        System.out.print("{ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + i + j);
                if (j != array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        Show s1 = new Show();
        String[][] array = {{"a", "b"}, {"c", "k"}, {"c", "e", "d"}};

        s1.showArray(array);
    }
}
