package LastDigitChecker.Exercise;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if (isValid((number1)) && isValid(number2) && isValid(number3)) {

            int digit1=0;
            int digit2=0;
            int digit3=0;

            digit1= number1%10;
            digit2= number2%10;
            digit3= number3%10;

            return (digit1 == digit2) || (digit2 == digit3) || (digit1 == digit3);

        }

        return false;

}

    public static boolean isValid(int number) {

        return (number >= 10) && (number <= 1000);
    }


}

