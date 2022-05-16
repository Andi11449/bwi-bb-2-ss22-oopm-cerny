package shapes.lists;

import shapes.entities.Shape;
import shapes.utils.MyAreaComparator;
import shapes.utils.MyShapeComparator;

public class ShapesLinkedList implements ShapesList {

    private Node head;
    private int length;

    public ShapesLinkedList(){}

    public void add(Shape s) {
        Node n = new Node(s);

        length++;
        if(head == null){
            head = n;
            return;
        }

        Node cur = head;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(n);
    }

    public int length() {
        return length;
    }

    public Shape get(int idx) {
        if(idx < 0 || idx >= length)
            return null;

        Node cur = head;
        for(int i = 0; i < idx; i++) {
            cur = cur.getNext();
        }

        return cur.getData();
    }

    private Node getNode(int idx) {
        if(idx < 0 || idx >= length)
            return null;

        Node cur = head;
        for(int i = 0; i < idx; i++) {
            cur = cur.getNext();
        }

        return cur;
    }

    public void remove(int idx) {
        if(idx < 0 || idx >= length)
            return;

        length--;
        if(idx == 0) {
            head = head.getNext();
            return;
        }

        Node cur = head;
        for(int i = 0; i < idx - 1; i++) {
            cur = cur.getNext();
        }

        //cur.next = cur.next.next;
        cur.setNext(cur.getNext().getNext());

    }

    public void sort(MyShapeComparator comparator) {
        boolean swapped;
        int i = 0;
        do{
            swapped = false;
            for(int k=1; k<length-i; k++){

                Node firstNode = getNode(k-1);
                Node secondNode = getNode(k);

                if(comparator.compare(firstNode.getData(), secondNode.getData()) > 0 ){
                    Shape tmp = firstNode.getData();
                    firstNode.setData(secondNode.getData());
                    secondNode.setData(tmp);
                    swapped = true;
                }

            } i++;
        }while(swapped);
    }




}
