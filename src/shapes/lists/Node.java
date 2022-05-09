package shapes.lists;

import shapes.entities.Shape;

public class Node {
    private Shape data;
    private Node next;

    public Node(Shape s) {
        data = s;
    }

    public Shape getData() {
        return data;
    }

    public void setData(Shape data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
