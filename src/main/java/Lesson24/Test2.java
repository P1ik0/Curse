package Lesson24;

public class Test2
{
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoSoron);
        f1.ploshad();
    }
}
 abstract class Figura
{

 abstract void perimetr();

 void showInfo(){
     System.out.println("eto figura");
 }
   abstract void ploshad();
    int kolichestvoSoron = 0;

}
class Kvadrat extends Figura{

    int kolichestvoSoron = 4;
    int storona = 1;
    @Override
    public void perimetr() {
        System.out.println("perimetr kvadrata = "  + 4 *  storona);
    }

    @Override
   public void ploshad() {
        System.out.println("ploshad kvadrata = " + storona * storona);
    }
}
class  Pryamougolnik extends Figura{
    int storona = 8;
    int storona2 = 5;
    @Override
    public void perimetr() {
        System.out.println("perimetr pramo = "  + 2 *  (storona + storona2));
    }

    @Override
    public void ploshad() {
        System.out.println("ploshad pramo = " + storona * storona2);
    }
}
class Okrujnpost extends Figura{
    int radiys = 3;
    @Override
    public void perimetr() {
        System.out.println("perimetr okr = "  + 2 *  3.14 * radiys);
    }

    @Override
    public void ploshad() {
        System.out.println("ploshad okr = " + 3.14 * radiys * radiys);
    }
}
abstract  class FourUgla extends Figura{
    void def(){
        System.out.println("thus FourUgla");
    }
}