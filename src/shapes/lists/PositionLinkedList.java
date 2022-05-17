package shapes.lists;

import shapes.entities.*;

public class PositionLinkedList {

    private class Node {
        private Position data;
        private Node next;

        public Node(Position s) {
            data = s;
        }
    }

    private Node head;
    private int length;

    public PositionLinkedList(){}

    public void add(Position s) {
        Node n = new Node(s);

        length++;
        if(head == null){
            head = n;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = n;
    }

    public int length() {
        return length;
    }

    public Position get(int idx) {
        Node node = getNode(idx);
        return node == null ? null : node.data;
    }

    private Node getNode(int idx) {
        if(idx < 0 || idx >= length)
            return null;

        Node cur = head;
        for(int i = 0; i < idx; i++) {
            cur = cur.next;
        }

        return cur;
    }

    public void remove(int idx) {
        if(idx < 0 || idx >= length)
            return;

        length--;
        if(idx == 0) {
            head = head.next;
            return;
        }

        Node cur = head;
        for(int i = 0; i < idx - 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
    }

    /* public void sort(MyShapeComparator comparator) {
        boolean swapped;
        int i = 0;
        do{
            swapped = false;
            for(int k=1; k<length-i; k++){

                PositionNode firstNode = getNode(k-1);
                PositionNode secondNode = getNode(k);

                if(comparator.compare(firstNode.data, secondNode.data) > 0 ){
                    Position tmp = firstNode.data;
                    firstNode.data = secondNode.data;
                    secondNode.data = tmp;
                    swapped = true;
                }

            } i++;
        }while(swapped);
    } */
}
