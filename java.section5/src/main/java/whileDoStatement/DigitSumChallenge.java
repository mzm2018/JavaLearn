package whileDoStatement;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        return sum;
    }
}
