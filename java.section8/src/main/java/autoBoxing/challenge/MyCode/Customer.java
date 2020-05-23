package autoBoxing.challenge.MyCode;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;
    private ArrayList<Double> transaction = new ArrayList<Double>();
    private String timeStamp;
    private ArrayList<String> date = new ArrayList<String>();

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(transaction);
        this.date = new ArrayList<String>();
        addTimestamp();
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public ArrayList<String> getDate() {
        return date;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void addTransaction(double newTransaction) {
        this.transaction.add(newTransaction);
        this.addTimestamp();
    }

    private void addTimestamp() {
        String timestamp = new Date().toString();
        this.date.add(timestamp);
    }


}
