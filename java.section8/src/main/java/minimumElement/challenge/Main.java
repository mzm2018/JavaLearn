package minimumElement.challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of Index for the Array: ");
        int[] arrays1 = readIntegers(scanner.nextInt());
        System.out.println("The Min Value for the Array : " +findMin(arrays1));
    }


    private static int findMin(int[] array) {
        int min = array[0];
        for (int i=0;i<array.length;i++)
            for (int j=0;j<array.length-i;j++) {
                if (array[i] < array[j] && array[i] < min) {
                    min = array[i];
                    System.out.println(min);

                }
            }
        return min;
    }

    private static Scanner scanner = new Scanner(System.in);
    private static int[] readIntegers(int count) {
        int[] values = new int[count];
        System.out.println("Enter the number of Values : \r");
        for (int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
