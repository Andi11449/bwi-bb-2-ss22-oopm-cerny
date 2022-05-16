package shapes.demos;

import shapes.entities.*;
import shapes.utils.MyShapeDefaultFormatter;
import shapes.utils.MyShapeFormatter;
import shapes.utils.MyShapeShortFormatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Rectangle(4, 5, new Position(4,6));
        array[1] = new Circle(4.3, new Position(-4, 10));
        array[2] = new Rectangle(19, 45, new Position(3, 5));


        printShapes(array, new MyShapeDefaultFormatter());
        printShapes(array, new MyShapeShortFormatter(true));
        printShapes(array, new MyShapeShortFormatter(false));
    }

    private static void printShapes(Shape[] array, MyShapeFormatter fmt) {
        System.out.println("*******************************");
        for (Shape s : array) {
            System.out.println(fmt.format(s));
        }
        System.out.println("*******************************\n");
    }
}
