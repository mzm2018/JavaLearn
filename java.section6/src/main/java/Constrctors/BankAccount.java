package Constrctors;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("11111", 0.0, "DefaultName", "default@email.com","0000000");
        System.out.println("Empty Constructor Called");

    }

    public BankAccount(String s, double v, String defaultName, String s1, String s2) {
        System.out.println("Account Constructor with parameter Called");
        this.accountNumber=s;
        this.balance=v;
        this.customerName=defaultName;
        this.email=s1;
        this.phoneNumber=s2;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("1111",0,customerName,email,phoneNumber);

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
    }
    public void withdrawFunds(double withdraw) {
        if (withdraw - this.balance < 0) {
            this.balance = this.balance - withdraw;
        }
    }


}

