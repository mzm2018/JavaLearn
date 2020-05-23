package AllFactors.Excercise;

public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int digit=0;
            for (int i = 1; i <= number; i++) {
            digit = number%i;
                if (digit == 0) System.out.println(i);

            }

        }
    }
}
