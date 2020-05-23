package autoBoxing.challenge.MyCode;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) >= 0) {
            System.out.println("customer name : " + customerName + ",Already exists");
            return false;
        }
        Customer newCustomer = new Customer(customerName);
        newCustomer.addTransaction(initialTransaction);
        this.customers.add(newCustomer);
        System.out.println("Customer Name : " + customerName + " with initial Transaction : " + initialTransaction + " Added.");
        return true;

    }

    private int findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addTransactionToCustomer(String name, double newTransaction) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                customer.addTransaction(newTransaction);
                return true;
            }
        }
        return false;
    }

    public void printCustomers() {
        if (this.customers != null) {
            for (int i = 0; i < this.customers.size(); i++) {
                Customer customer = this.customers.get(i);
                ArrayList<Double> trans = customer.getTransaction();
                ArrayList<String> timestamp = customer.getDate();
                System.out.println(i + 1 + ". " + customer.getName() + "\n" + "No. of Transactions: ");
                for (int j = 0; j < trans.size(); j++) {
                    System.out.println(i + 1 + ". " + trans.get(j).doubleValue() + " - " + timestamp.get(j));
                }
            }
        }
    }
}