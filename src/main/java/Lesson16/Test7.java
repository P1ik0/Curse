package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Uraaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa", "УРАА").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('W')));

        /*(concat) Hello World concat Uraaaaa!!! s3 ---> new object, HelloWorldUraaaaa!!!
       (trim) HelloWorldUraaaaa!!! s3 ---> new object,      HelloWorldUraaaaa!!!
        (replace) Hello World concat Uraaaaa!!! s3 ---> new object, HelloWorldУРАА!!!
       ( substring) (substring(6,10))  HelloWorld s3 ---> new object, World
         */
    }
}
