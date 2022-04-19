package shapes.demos;

import shapes.entities.Rectangle;

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(14, 33);
        Rectangle r3 = new Rectangle(6);
        Rectangle r4 = new Rectangle(r2);
        r2.scale(1.2, 0.5);
        r4.scale(5);

        //System.out.println(r2.getWidth() + " * " + r2.getHeight() + " = " + r2.getArea());
        r1.print();
        r2.print();
        r3.print();
        r4.print();
    }
}
