package TheForLoopStatement;

public class Main {

    public static void main(String[] args) {

        for (int i=1;i<=5;i++) {
            System.out.println("10000 at " + i + "% Interest " + calculateInterest(10000 , i));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));

    }




}
