package ComplexNumber_Excercise34;

public class Main {
    public static void main(String[] Args) {

        ComplexNumber one = new ComplexNumber(1.0 , 1.0);
        ComplexNumber number = new ComplexNumber(2.5 , -1.5);
        one.add(1,1);
        System.out.println("oneReal= " + one.getReal());
        System.out.println("oneImaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("oneReal= " + one.getReal());
        System.out.println("oneImaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("oneReal= " + number.getReal());
        System.out.println("oneImaginary= " + number.getImaginary());

    }
}
