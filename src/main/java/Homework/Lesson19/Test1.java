package Homework.Lesson19;

public class Test1 {
    public void abc(String[]... args2) {
        for (String [ ] s1 : args2) {
            for (String s2 : s1) {
                if (s2 != null ){
                    System.out.print(s2 + " ");
                } else
                {
                    System.out.print("null" + " ");
                }


            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Test1 t = new Test1();
        String[] array1 = {"help", "ananas", " aaaa"};
        String[] array2 = {args[0]};
        t.abc(array1, array2);
    }

}
