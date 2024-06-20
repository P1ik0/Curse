package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

//        //присвой s10 substring начиная с 3 индекса = "defgabcd"
//        String s10 = s1.substring(3);
//        System.out.println(s10);
//
//        //начиная с 3 индекса до 6 входит до s11
//        String s11 = s1.substring(3,7);
//        System.out.println(s11);
//
//        //убирает пробели по бокам но внутри оставляет
//        String s12 = s1.trim();
//        System.out.println(s12);
//
//        //чтобы ввошёл нужный идекс 'd' = 10, нужно указать на 1 больше 11
//        //так как всё НЕ ВКЛЮЧИТЕЛЬНО (10)
//        String s13 = s1.substring(3,11);
//        System.out.println(s13);


        //меняет значения char 1 буквы на 2. 'r' = 'z'
        String s14 = s1.replace('r','z');
        System.out.println(s14);

        //меняет значения string  с 1 на 2 . "vet" ="vivkra"
        String s15 = s1.replace("vet","vivkra");
        System.out.println(s15);

        //true
        String s2 = "poka";
        String s3 = s2.replace('k', 'k');
        System.out.println(s2 == s3);


        // соединяет
        String s5 = "privet";
        String s6 = "drug";
        System.out.println(s5.concat(s6));


    }
}
