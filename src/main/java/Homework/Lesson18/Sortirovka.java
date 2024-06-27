package Homework.Lesson18;

public class Sortirovka {
    public  void   sort1(int[] array)
    {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } 
    }


    public static void main(String[] args) {
        Sortirovka s1 = new Sortirovka();
        int[] array = {1, 9, 3, -8, 0, 5, 4, 1};
        s1.sort1(array);
    }
}
