package shapes.demos;

import shapes.lists.*;
import shapes.entities.*;
import shapes.utils.*;

public class MyListDemo {
    public static void main(String[] args) {
        MyList<Shape> list = new MyLinkedList<>();
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

        System.out.println();

        list.sort(new MyStringComparator<Shape>());
        printList(list);
        System.out.println();


        MyList<Position> posList = new MyArrayList<>();
        posList.add(new Position(-3, 127));
        posList.add(new Position(34, 12));
        posList.add(new Position(-1234, 123));

        printList(posList);

        MyList<Displayable> displayList = new MyLinkedList<>();

        addAll(displayList, list);
        addAll(displayList, posList);
        /*for (int i = 0; i < list.length(); i++) {
            scanList.add(list.get(i));
        }
        for (int i = 0; i < posList.length(); i++) {
            scanList.add(posList.get(i));
        }*/

        System.out.println();
        printList(displayList);
    }

    private static <T> void addAll(MyList<T> list, MyList<? extends T> elementsToAdd) {
        for (int i = 0; i < elementsToAdd.length(); i++) {
            list.add(elementsToAdd.get(i));
        }
    }

    /*
    private static <T> void addElements(MyList<? super T> list, MyList<T> elementsToAdd) {
        for (int i = 0; i < elementsToAdd.length(); i++) {
            list.add(elementsToAdd.get(i));
        }
    }

    private static <T, A extends T> void addElements(MyList<T> list, MyList<A> elementsToAdd) {
        for (int i = 0; i < elementsToAdd.length(); i++) {
            list.add(elementsToAdd.get(i));
        }
    }
    */

    private static <T> void printList(MyList<T> list) {
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }
    }
}
