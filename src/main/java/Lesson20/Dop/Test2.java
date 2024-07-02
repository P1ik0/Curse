package Lesson20.Dop;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        char [] array4 = {'p','r','i','v','e', 't'};
        char [] array3 = {'p','r','i','v','i', 'v','k', 'a'};

        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array3, array4));
    }
}
