package carpetCostClaclulator.Excercise33;

public class Calculator {

    private final Floor floor;
    private final Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost () {
        return this.floor.getArea() * this.carpet.getCost();
    }


}
