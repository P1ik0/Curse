package Lesson21;

public class Test6 {
    int abc()
    {
        return 5;
    }
    int abc2(int i){
        if (i >10){
            return 5;
        }
        else {
            return 10;
        }
    }
void abc3(int i2){
    System.out.println("hello");
    if (i2>3){
    return;
    }

}
    public static void main(String[] args) {
        int a = new Test6().abc();
        new Test6().abc();
    }
}
