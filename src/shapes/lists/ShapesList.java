package shapes.lists;

import shapes.entities.Shape;

public interface ShapesList {
    void add(Shape s);
    void remove(int idx);
    int length();
    Shape get(int idx);
}
