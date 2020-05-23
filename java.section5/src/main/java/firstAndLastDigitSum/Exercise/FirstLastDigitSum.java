package firstAndLastDigitSum.Exercise;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }
        if (number <10) {
            return sum = number*2;
        }
            int refNumber = number;
            int firstNumber=0;
            int i = 0;
            for (i = number; i > 0; i /= 10) {

                firstNumber = i % 10;
                number /= 10;
                if ((i == refNumber) || ( i < 10)) {
                    sum+=firstNumber;
                }

            }
            return sum;
        }
    }

