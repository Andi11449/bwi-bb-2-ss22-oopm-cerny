package shapes.utils;

import shapes.entities.Shape;

public class MyAreaComparator implements MyShapeComparator{
    @Override
    public int compare(Shape s1, Shape s2) {
        /*if(s1.getArea() < s2.getArea())
            return -1;
        if(s1.getArea() > s2.getArea())
            return 1;
        return 0;*/

        return Double.compare(s1.getArea(), s2.getArea());
    }
}
