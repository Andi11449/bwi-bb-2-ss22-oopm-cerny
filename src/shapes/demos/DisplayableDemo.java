package shapes.demos;

import shapes.entities.*;

public class DisplayableDemo {
    public static void main(String[] args) {
        Displayable[] array = new Displayable[4];
        array[0] = new Rectangle(4, 5, new Position(4,6));
        array[1] = new Circle(4.3, new Position(-4, 10));
        array[2] = new Rectangle(19, 45, new Position(3, 5));
        array[3] = new Position(-4, 5);

        for (int i = 0; i < array.length; i++) {
            array[i].display();
        }
    }
}
