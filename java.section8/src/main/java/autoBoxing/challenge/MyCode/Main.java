package autoBoxing.challenge.MyCode;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;
        printOptions();
        while (!quit) {
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter branch name : ");
                    bank.addBranch(scanner.nextLine());
                    break;
                case 2:
                    bank.printBranches();
                    break;
                case 3:
                    addCustomerToBranch();
                    break;
                case 4:
                    addTransactionToCustomer();
                    break;
                case 5:
                    printListOfCustomers();
                    break;
                case 6:
                    printOptions();
                    break;
            }


        }

    }

    private static void printOptions() {
        System.out.println("0 - quit\n" +
                "1 - Add bank branch\n" +
                "2 - print branches \n" +
                "3 - Add customer with initial Transaction to an existing branch\n" +
                "4 - Add additional Transaction for existing customer\n" +
                "5 - print list of customers for specific branch with their related transactions\n"
        );
    }

    private static void addCustomerToBranch() {
        System.out.print("Enter existing branch name : ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer name to be added : ");
        String newCustomer = scanner.nextLine();
        System.out.print("Enter initial Transaction for this Customer : ");
        double trans = scanner.nextDouble();
        scanner.nextLine();
        bank.AddCustomerToBranch(branchName, newCustomer, trans);
    }

    private static void addTransactionToCustomer() {
        System.out.print("Enter existing branch name : ");
        String branchName2 = scanner.nextLine();
        System.out.print("Enter existing customer : ");
        String newCustomer2 = scanner.nextLine();
        System.out.print("Enter new Transaction for this Customer : ");
        double trans2 = scanner.nextDouble();
        scanner.nextLine();
        bank.AddTransactionForExistingCustomer(branchName2, newCustomer2, trans2);

    }

    private static void printListOfCustomers() {
        System.out.print("Enter existing branch name : ");
        String branchName3 = scanner.nextLine();
        bank.printListOfCustomer(branchName3);
    }


}
