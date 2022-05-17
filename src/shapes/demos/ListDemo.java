package shapes.demos;

import shapes.lists.*;
import shapes.entities.*;
import shapes.utils.MyAreaComparator;
import shapes.utils.MyDistanceComparator;
import shapes.utils.MyShapeComparator;

public class ListDemo {
    public static void main(String[] args) {
        ShapesLinkedList list = new ShapesLinkedList();
        list.add(new Rectangle(4, 53, new Position(33, 4)));
        list.add(new Rectangle(45, 1, new Position(3, 1)));
        list.add(new Circle(12, new Position(4, 12)));
        list.add(new Rectangle(1, 3, new Position(-12, 7)));
        list.add(new Rectangle(564, 123, new Position(-234, 12)));
        list.add(new Circle(4, new Position(3, 4)));
        
        printList(list);

        System.out.println();

        //list.remove(1);
        list.sort(new MyAreaComparator());
        printList(list);

        System.out.println();

        list.sort(new MyDistanceComparator());
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
