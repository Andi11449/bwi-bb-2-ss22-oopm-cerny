package shoppingList;

public class Main {
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();
        list.addItem("Flour", 0.99F, 2);
        list.addItem("Eggs(10)", 3.39F, 1);
        list.addItem("Milk", 1.49F, 3);
        list.addItem("Jam", 2.00F, 1);

        list.display();
        list.sortByPrice();
        list.display();

        //list.writeToFile("F:\\shoppingList.txt");
        //list.writeToFile("shoppingList.txt");

        ShoppingList list2 = new ShoppingList();
        list2.readFromFile("shoppingList.txt");
        list2.addItem("Sugar", 1.39F, 1);
        list2.sortByQuantity();
        list2.writeToFile("shoppingList2.txt");
    }
}
