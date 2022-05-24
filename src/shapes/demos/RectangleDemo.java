package shapes.demos;

import shapes.entities.Position;
import shapes.entities.Rectangle;

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(14, 33);
        /*Position pos = new Position();
        pos.setX(4);
        pos.setY(5);
        r2.setPosition(pos);*/

        r2.setXY(4, -1);

        Position p = r2.getCenter();
        System.out.printf("X: %.2f; Y: %.2f\n", p.getX(), p.getY());
        p.setX(30);
        System.out.printf("X: %.2f; Y: %.2f\n", p.getX(), p.getY());

        Rectangle r3 = new Rectangle(6);
        Rectangle r4 = new Rectangle(r2);
        r4.setXY(6, 25);

        r2.scale(1.2, 0.5);
        r4.scale(5);

        //System.out.println(r2.getWidth() + " * " + r2.getHeight() + " = " + r2.getArea());
        r1.display();
        r2.display();
        r3.display();
        r4.display();
    }


}
