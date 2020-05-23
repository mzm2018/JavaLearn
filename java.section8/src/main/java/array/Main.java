package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        double[] myDoubleArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myDoubleArray[0]);
        System.out.println(myDoubleArray[1]);
        int[] myIntArray1 = new int[10];

        for (int i=0;i<myIntArray1.length;i++) {
            myIntArray1[i]=i*10;
        }
        int[] myIntArray2 = getInteger(5);
        printArray(myIntArray2);
        System.out.println("The Average is : " + getAverage(myIntArray2));



    }
     private static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] array ) {
        for (int i = 0;i<array.length;i++) {
            System.out.println("element " + i + "," + "value is  + " + array[i] );
        }
    }
    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer Values .\r");
        int[] values = new int[number];
        for(int i =0; i <values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length;i++) {
            sum += array[i];
        }
        return (double) sum /array.length;
    }
}
