package shapes.lists;

import shapes.entities.Shape;

public class ShapesLinkedList extends ShapesList {

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




}
