package shoppingList;

import java.io.*;
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
        //itemList.sort(new NameComparator());
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

    public void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(String.format(Locale.ROOT, "%-12s %9s %12s\n", "Name", "Price", "Quantity"));
            for (Item it : itemList) {
                writer.write(String.format(Locale.ROOT,"%-12s %8.2f€ %12d\n", it.getName(), it.getPrice(), it.getQuantity()));
            }
            writer.write(String.format(Locale.ROOT,"%-12s %8.2f€\n\n", "Total:", totalCost()));
        }
        catch (FileNotFoundException e) {
            writeToDebugFile(e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            //call readLine to skip header
            reader.readLine();

            for (String line = reader.readLine(); line != null && !line.startsWith("Total:"); line = reader.readLine()) {
                try {
                    Item it = parseItem(line);
                    itemList.add(it);
                } catch (ParseItemException e) {
                    writeToDebugFile(e);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Item parseItem(String line) throws ParseItemException {
        try {
            String[] strings = line.split("\\s+");
            float price = Float.parseFloat(strings[1].substring(0, strings[1].length() - 1));
            int quantity = Integer.parseInt(strings[2]);
            return new Item(strings[0], price, quantity);
        }
        catch (Exception e) {
            throw new ParseItemException("Parse Exception in line : \"" + line + "\"");
        }
    }

    private void writeToDebugFile(Exception e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("debug.txt", true))) {
            writer.write(e.toString());
            writer.newLine();
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
