package parsingValueFromString;

public class Main {

    public static void main(String[] args) {

        String numberAsString= "2020";
        int number = Integer.parseInt(numberAsString);
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Parsed String : " + number);
        System.out.println("Parsed String : " + doubleNumber);

        number +=1;

        System.out.println("incremented number : " + number);
    }
}
