package Lesson18;

public class Test2 {
    public static void main(String[] args) {
        String []array1;
        int [][] array2;

        int[] array4 = {5,3,6};




        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = "hi" + i;
            System.out.println(array1[i]);

        }
        array2[0] = new int[5];//0 Элемент арай 2 теперь будет иметь длину 5
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                array2[i][j] = i + j;
                System.out.println(array2[i][j]);
            }
        }

    }


}
