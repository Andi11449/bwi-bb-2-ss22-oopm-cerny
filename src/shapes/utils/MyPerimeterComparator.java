package shapes.utils;

import shapes.entities.Shape;
import java.util.*;


public class MyPerimeterComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getPerimeter(), o2.getPerimeter());
    }
}
