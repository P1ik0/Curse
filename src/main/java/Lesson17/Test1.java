package Lesson17;

class Car {
}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("o",2));
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5,8);
        System.out.println(s2);

        //так же работает как substring но на оутпуте char
//        System.out.println(s2.subSequence(5,8));


        //добавляет  в конец 22 и тру и хеллоу  и самого себя
//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append("Hello");
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);

        //вставляет на определёную позицию значения
        System.out.println(sb2.insert(4,55));

        //удаляет символы с определёного индекса до определеного
        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(3,6);
//        System.out.println(sb10);

        //удаляет елемент
        sb10.deleteCharAt(6);
        System.out.println(sb10);

        //переворачивает
        sb10.reverse();
        System.out.println(sb10);

        //заменяет с определёного олемента до опредленого значением
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5,"Pete");
        System.out.println(sb12);

        //место в матрице
        System.out.println(sb1.capacity());



    }

}
