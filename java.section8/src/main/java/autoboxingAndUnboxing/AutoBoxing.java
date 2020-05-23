package autoboxingAndUnboxing;

import java.util.ArrayList;

public class AutoBoxing {
    private static ArrayList<Integer> arrayListInt1 = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            arrayListInt1.add(i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + arrayListInt1.get(i).intValue());
        }
    }


}


