package Array.challange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = getInteger(5);
        int[] sorted = sortArray(array1);
        printArray(sorted);
    }

    public static int[] getInteger(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elements :\r");
        int[] values = new int[number];
        for (int i =0; i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array,array.length);
        boolean flag =true;
        int temp=0;
        while (flag) {
            flag=false;
            for (int i=0;i<array.length-1;i++) {
                if(sorted[i] < sorted[i+1]) {
                    temp=sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag=true;
                }
            }
        }

        return sorted;
    }
    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }
}

