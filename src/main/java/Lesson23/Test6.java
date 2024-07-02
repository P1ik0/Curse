package Lesson23;

public class Test6 {
}
class Animal{
   static String showName(){
        return "Some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name animal: " + showName());
    }

}
class Mouse extends  Animal {
   static String showName() {
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name mouse: " + showName());
    }
    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}

