package shapes.demos;

import shapes.lists.*;
import shapes.entities.*;

public class ListDemo {
    public static void main(String[] args) {
        ShapesList list = new ShapesArrayList();
        list.add(new Rectangle());
        list.add(new Rectangle());
        list.add(new Circle());
        list.add(new Rectangle());
        list.add(new Rectangle());
        list.add(new Circle());
        
        printList(list);

        System.out.println();

        list.remove(1);
        printList(list);

        //System.out.println(list.get(192));
        //System.out.println(list.get(-1));
    }

    private static void printList(ShapesList list) {
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }
    }
}
