package Lesson20;
import java.util.ArrayList;
public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1  = new StringBuilder("Hello");
        StringBuilder sb2  = new StringBuilder("ok");
        StringBuilder sb3  = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");// по очередм будет вызыивать елемент под этим индексом и добавлять к нему !!!
        }
        for (StringBuilder sb:list)
        {
            System.out.print(sb + " ");
        }
        list.remove(2);//удаляем елемент по индексу
        System.out.println();
        for (StringBuilder sb:list)
        {
            System.out.print(sb + " ");
        }
        list.add(sb3);

        list.remove(sb1);//удаляем елемент по значению
        System.out.println();
        for (StringBuilder sb:list)
        {
            System.out.print(sb + " ");
        }




    }
}
