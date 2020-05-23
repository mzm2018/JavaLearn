package palindrome.Exercise;

public class ReverseNumber {
    public static boolean isPalindrome(int number) {

        int reverse=0;
        int origNumber=number;
        while (number !=0) {
            int lastDigit = number % 10;
            reverse /= 10;
            reverse+=lastDigit;
            number /=10;


        }
        return (origNumber == reverse);


    }
}
