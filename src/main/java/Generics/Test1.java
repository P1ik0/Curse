package Generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        ArrayList <String> al = new ArrayList();

        info <String> info1 = new info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();


        info <Integer> info2 = new info<>(100);
        System.out.println(info2);
        Integer i = info2.getValue();


    }
//    public void abc(info<String> info){
//        String  s = info.getValue();
//    }
//    public void abc(info<Integer> info){
//        Integer  i = info.getValue();
//    }
}
class info <T>{
    private T value;
    public info(T value){
        this.value = value;
    }
    public String toString(){
        return "[{" + value + "}]";
    }
    public T getValue(){
        return value;
    }
}