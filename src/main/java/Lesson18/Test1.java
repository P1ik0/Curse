package Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double [] []array3;
        int [][]array10;
        double[] array7;

        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array10 = new int[3][];
        array7 = new double[2];

        //static
        array2[0] = "hi";
        array2[1] = "bye";
        array2[2] = "ok";


        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;

        array7 = array5;
        System.out.println(array3[1][0]);
    }
}
