package shapes.utils;

import shapes.entities.Shape;
import shapes.utils.*;

public class MyShapeShortFormatter extends MyFormatter<Shape> {
    boolean withArea;

    public MyShapeShortFormatter(boolean withArea) {
        this.withArea = withArea;
    }

    @Override
    public String format(Shape s) {
        if (withArea)
            return String.format("Center: [x=%.2f, y=%.2f], Area: %.2f", s.getCenter().getX(), s.getCenter().getY(), s.getArea());

        return String.format("Center: [x=%.2f, y=%.2f]", s.getCenter().getX(), s.getCenter().getY());
    }
}
