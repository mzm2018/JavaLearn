package ReadingUserInput_Excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter=1;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        while (counter != 10) {
                System.out.println("Enter number #" + counter);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum+= number;
                counter++;
                } else {
                    System.out.println("Invalid number");

            }
       scanner.nextLine();

        }
        System.out.println("The Sum = " + sum);
            scanner.close();

    }
}
