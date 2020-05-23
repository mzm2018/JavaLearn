package GreatestCommonDivisor.Excercise;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int number1, int number2) {

        int sharedLarge=0;

        if ((number1 < 10) || (number2 < 10)) sharedLarge =-1;

        else {
            int digit1 = 0;
            int digit2 = 0;
            for (int i = number1; i > 0; i--) {
                digit1 = number1 % i;
                if (digit1 == 0) {
                    for (int j = number2; j > 0; j--) {
                        digit2 = number2 % j;
                        if ((digit2 == 0) && (i == j)) {
                            if (j > sharedLarge) {
                                sharedLarge = i;
                            }
                        }
                    }
                }
            }
        }
            return sharedLarge;
    }
}