package SharedDigit.Excercise;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if (((number1 >=10) && (number1 <=99)) && ((number2 >=10) && (number2 <=99))) {

            int digit1=0;
            int digit2=0;
            boolean match;
            for (int i = number1; i >0; i/=10) {

                digit1 = i % 10;
                //System.out.println(digit1);
                for (int j = number2; j>0; j/=10) {
                    digit2 = j % 10;
                    System.out.println(digit2);
                    if (digit1 == digit2) return true;
                }
            }

        }
        return false;

    }
    
}
