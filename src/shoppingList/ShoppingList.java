package shoppingList;

import java.util.*;

public class ShoppingList {
    List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(String name, float price, int quantity) {
        Item it = new Item(name, price, quantity);
        itemList.add(it);
    }

    public void sortByName(){
        itemList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void sortByPrice(){
        itemList.sort((o1, o2) -> Float.compare(o1.getPrice(), o2.getPrice()));
    }

    public void sortByQuantity(){
        itemList.sort((o1, o2) -> Integer.compare(o1.getQuantity(), o2.getQuantity()));
    }

    public float totalCost(){
        float cost = 0;
        for (Item it : itemList)
            cost += it.getPrice() * it.getQuantity();
        return cost;
    }

    public void display() {
        System.out.printf(Locale.ROOT, "%-12s %9s %12s\n", "Name", "Price", "Quantity");
        for (Item it : itemList) {
            System.out.printf(Locale.ROOT,"%-12s %8.2f€ %12d\n", it.getName(), it.getPrice(), it.getQuantity());
        }
        System.out.printf(Locale.ROOT,"%-12s %8.2f€\n\n", "Total:", totalCost());
    }
}
