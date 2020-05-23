package arrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
    groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i=0;i<groceryList.size();i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if ( position >=0) {
        groceryList.set(position,newItem);
        System.out.println("Grocery Item " + position + " has been Modified");
        }
        else {
            System.out.println("Your item is not found");
        }
    }


    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if ( position >= 0) {
            groceryList.remove(position);
        }
    }

    private int findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        return  groceryList.indexOf(searchItem);

    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

}