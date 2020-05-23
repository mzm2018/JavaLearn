package PerfectNumber.Excercise;

public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {

        boolean isPerfect=false;
        if (number > 1) {
            int sum=0;
            int digit=0;
            for (int i = 1; i <= number; i++) {
                digit = number%i;
                if (digit == 0) {
                      sum+=i;
                }
                if (number == sum) isPerfect = true;

            }

        }
        return isPerfect;
    }
}

