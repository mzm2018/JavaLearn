package MinAndMaxInput_Excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minimum=0;
        int maximum=0;
        boolean first =true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number");
            boolean validInt = scanner.hasNextInt();

            if (validInt) {
                int number = scanner.nextInt();
                if(first) {
                    first=false;
                    minimum=number;
                    maximum=number;
                }

                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum) {
                    minimum = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min: " + minimum + " maximum: " + maximum );
        scanner.close();


            }


    }
