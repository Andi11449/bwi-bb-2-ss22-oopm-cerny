package shapes.utils;

import shapes.entities.Shape;

import java.util.Comparator;

public class MyDistanceComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        double d1 = Math.sqrt(Math.pow(s1.getCenter().getX(), 2) + Math.pow(s1.getCenter().getY(), 2));
        double d2 = Math.sqrt(Math.pow(s2.getCenter().getX(), 2) + Math.pow(s2.getCenter().getY(), 2));
        return Double.compare(d1, d2);
    }
}
