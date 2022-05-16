package shapes.utils;

import shapes.entities.Shape;

public class MyShapeDefaultFormatter extends MyShapeFormatter{
    @Override
    public String format(Shape s) {
        return s.toString();
    }
}
