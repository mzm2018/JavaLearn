package ReverseArray.challenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array1));
        reverse(array1);
        System.out.println(Arrays.toString(array1));
    }

private static void reverse(int[] array) {
    int maxIndex = array.length-1;
    int halfLength = array.length/2;
    for(int i=0;i<halfLength;i++) {
        int temp = array[i];
        array[i] = array[array.length-i-1];
        array[array.length-i-1] = temp;

    }
}


}
