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
    }
}
