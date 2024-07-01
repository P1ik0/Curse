package Lesson22.p1;
import Lesson22.chelovek;
public class Test1 {
    public static void main(String[] args) {
        chelovek c = new chelovek("male");
        c.setVozvrast(23);
        c.setVes(90);
        System.out.println(c.getName());
        System.out.println(c.getVozvrast());
        System.out.println(c.getVes());
    }

}
