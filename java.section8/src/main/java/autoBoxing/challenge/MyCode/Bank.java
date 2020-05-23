package autoBoxing.challenge.MyCode;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public Bank() {
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) >= 0) {
            System.out.println("Branch " + branchName + ",Already exists");
        } else {
            this.branches.add(new Branch(branchName));
            System.out.println("Branch name : " + branchName + " Created.");
        }
    }

    public void AddCustomerToBranch(String branchName, String customerName, double Transaction) {
        int position = findBranch(branchName);
        if (position >= 0) {
            Branch existingBranch = branches.get(position);

            if (existingBranch.addCustomer(customerName, Transaction)) {
                System.out.println("Customer name : " + customerName + " added to " + branchName + " Branch");
            }
        } else {
            System.out.println("Branch name : " + branchName + " Not Exists");
        }
    }


    private int findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            Branch existingBranches = branches.get(i);
            if (existingBranches.getBranchName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printBranches() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println((i + 1) + ". " + this.branches.get(i).getBranchName());
        }
    }

    public void AddTransactionForExistingCustomer(String branchName, String customerName, double newTransaction) {

        int position = findBranch(branchName);
        if (position >= 0) {
            Branch existingBranch = branches.get(position);
            if (existingBranch.addTransactionToCustomer(customerName, newTransaction)) {
                System.out.println("new Transaction Updated");
            } else {
                System.out.println("Customer not exists");
            }
        }
    }

    public void printListOfCustomer(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch existingBranches = this.branches.get(i);
            existingBranches.printCustomers();
        }
    }

    public void printListOfCustomerTransaction(String branchName, String customerName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch existingBranches = this.branches.get(i);
        }
    }

}