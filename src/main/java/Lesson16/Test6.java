package Lesson16;

public class Test6 {
    public static void main(String[] args) {

        //все буквы стали маленькими
        String s = "PriVEt";
        String s2 = s.toLowerCase();
        System.out.println(s2);

        //все буквы стали большими
        String s3 = s.toUpperCase();
        System.out.println(s3);

        //Имеется ли елемент в строке
        Boolean b = s.contains("V");
        System.out.println(b);


    }
}
