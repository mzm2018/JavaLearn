package NumberToWords.Excercise;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number <0) {
            System.out.println("Invalid Value");
        }
        else if (number==0){
            System.out.println("Zero");

        }
        else {
            int lastDigit=0;
            int reversNum=reverse(number);
            int leadingZero= getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = reversNum; i!=0; i/=10) {
                lastDigit=i % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
            }
           while (leadingZero !=0) {
               System.out.println("Zero");
               leadingZero--;
           }

        }



    }

    public static int reverse (int number) {
        int digit1= getDigitCount((number));
        int num2=0;
        int multi= digit1*10;
        while (number != 0) {
            int lastDigit = number % 10;
            num2 = (num2 * 10) + lastDigit;
            number /= 10;
        }
        return num2;


    }

    public static int getDigitCount(int number) {
        int digit=0;
        if (number < 0)
            return -1;
        do {
            digit++;
            number/=10;
        }
        while (number !=0);

        return digit;
    }


}
