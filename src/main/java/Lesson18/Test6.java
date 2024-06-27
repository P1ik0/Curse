package Lesson18;

public class Test6 {
    public static void  maxMin(double [] array)
    {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }

        }
        System.out.println("min: " + min + '\n'+ "max: "  + max);

    }

    public static void main(String[] args) {
        double array[] = {1.3, 9, 3, -8.1, 0, 5, 4, 1};

        maxMin(new double[] {1.3, 8.1, 1, 5, 46, 11, -32});
    }
}
