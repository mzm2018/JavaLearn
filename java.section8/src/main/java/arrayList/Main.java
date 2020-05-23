package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 private static Scanner scanner = new Scanner(System.in);
 private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }

    }
        public static void printInstructions() {
            System.out.println("\n Press ");
            System.out.println("\t 0 - To print choice option");
            System.out.println("\t 1 - To print the list of grocery Item");
            System.out.println("\t 2 - To add an ite to list ");
            System.out.println("\t 3 - To modify an item to the list");
            System.out.println("\t 4 - To remove an item from the list");
            System.out.println("\t 5 - To search for an item from the list");
            System.out.println("\t 6 - To quit the Application");

    }
        public static void addItem() {
            System.out.print("Please enter the grocery item : ");
            groceryList.addGroceryItem(scanner.nextLine());
        }

        public static void modifyItem() {
            System.out.print("Enter your Item to Modify : ");
            String currentItem = scanner.nextLine();
            System.out.print("Enter the new Item : ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryList(currentItem,newItem);
        }
        public static void removeItem() {
            System.out.print("Enter your item to be removed : ");
            String removeItem = scanner.nextLine();
            groceryList.removeGroceryItem(removeItem);
            System.out.println(removeItem + " has been removed");
        }
        public static void searchItem() {
            System.out.print("Item to search for : ");
            String searchItem = scanner.nextLine();
            if (groceryList.onFile(searchItem)) {
                System.out.println("Found " + searchItem);
            } else {
                System.out.println(searchItem + ", not on File");
            }
        }

        public static void processArrayList() {
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(groceryList.getGroceryList());
            String[] array1 = new String[groceryList.getGroceryList().size()];
            groceryList.getGroceryList().toArray(array1);
        }



}
