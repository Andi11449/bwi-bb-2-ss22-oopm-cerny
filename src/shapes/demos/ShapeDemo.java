package shapes.demos;

import shapes.entities.*;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Rectangle(4, 5, new Position(4,6));
        shapes[1]  = new Circle(4.3, new Position(-4, 10));
        shapes[2]  = new Rectangle(19, 45, new Position(3, 5));

        for (Shape s : shapes) {
            if(s == null)
                continue;
            s.display();
        }

        Shape shape = new Circle();
        shape.display();
    }
}
