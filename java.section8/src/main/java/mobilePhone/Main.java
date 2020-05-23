package mobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 6;
        while (!quit) {
            System.out.print("Enter your option : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addMobileContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                case 6:
                    printActions();
                    break;
            }
        }


    }


    private static void printActions() {
        System.out.println("\nAvailable Actions:\n press :");
        System.out.println("0 - Quit\n" +
                "1 - print Contacts\n" +
                "2 - Add new Contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove and existing contact\n" +
                "5 - query if existing contact exists\n" +
                "6 - to print a list of available actions");
        System.out.println("Choose your action: ");
    }


    private static void addMobileContacts() {
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Mobile number : ");
        String number = scanner.nextLine();
        Contact contact = Contact.createContact(name, number);
        if (mobilePhone.AddContact(contact)) {
            System.out.println("new contact added: " + name + ", phone = +" + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }


    }

    private static void updateContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not Found");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact Phone Number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = new Contact(newName, newPhone);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully update record");

        } else {
            System.out.println("Error updating record");
        }


    }

    private static void removeContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not Found.");

        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("successfully Deleted");
        } else {
            System.out.println("error deleting Record");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not Found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

    }
}
