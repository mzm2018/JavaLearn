package encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagePrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        if (isDuplexPrinter())
        return pagePrinted /2;
        else {
            return pagePrinted;
        }
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillToner(int toner) {
        this.tonerLevel = Math.min((getTonerLevel() + toner), 100);
        System.out.println("Toner Level= " + getTonerLevel() + "%");

    }
    public void printing() {
            this.pagePrinted ++;
            System.out.println("printing...");

    }

}