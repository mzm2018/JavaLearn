package encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(10,true);
        printer1.fillToner(20);
        System.out.println(printer1.getPagePrinted());
        printer1.printing();
        printer1.fillToner(20);
        printer1.printing();
        printer1.fillToner(60);
        System.out.println(printer1.getPagePrinted());


    }
}
