package TheSwitchStatement;

public class Main {

    public static void main(String[] args) {

        int value=1;
        switch (value) {

            case 1:
                System.out.println("The value is " + value);
                break;
            case 2:
                System.out.println("The value is " + value);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        String Month="january";
        switch (Month.toLowerCase()) {
            case "january":
                System.out.println("january");

            default:
                System.out.println("Not Jan");

        }

    }
}
