package polymorphism;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheel;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheel = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine() {
        return "Car --> startEngine()";
    }
    public String accelerate() {
        return "Car --> accelerate()";
    }
    public String brake() {
        return "Car --> brake()";
    }

}


class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Misubishi --> brake()";
    }
}   


public class Challenge {
    public static void main(String[] args) {

    }

    static class Ford extends Car{
        public Ford(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Ford --> startEngine()";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "Ford --> accelerate()";
        }

        @Override
        public String brake() {
            return "Ford --> brake()";
        }
    }
}
