package ReadingUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Year of birth :");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (Enter Key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " And your " + age + " years old");
            }
            else {
                System.out.println("Invalid year of birth");
            }
        }
        else {
            System.out.println("Unable to parse Year of birth");
        }

        scanner.close();
    }
}
