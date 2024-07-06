package Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();

    }
}

class GetMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
