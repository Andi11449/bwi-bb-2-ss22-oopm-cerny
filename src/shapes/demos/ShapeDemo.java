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
            prettyPrintShape(s);
        }

        Rectangle r = new Rectangle(4, 43, new Position(-5, 4.3));
        prettyPrintShape(r);

        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        //Shape shape = new Circle();
        //shape.display();

        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(r2.equals(r3));
    }

    public static void prettyPrintShape(Shape s){
        System.out.println("++++++++++");
        s.display();
        System.out.println("++++++++++");
    }
}
