package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
//        String s = new String(array);
//        System.out.println(s);
        StringBuilder sb = new StringBuilder("privet");
       // System.out.println(sb.append(array,2,3)); // ive  = 2 с какой позиции и сколько 3
        sb.insert(1,array,2,3);
        System.out.println(sb);



    }
}
