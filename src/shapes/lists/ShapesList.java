package shapes.lists;

import shapes.entities.Shape;

public abstract class ShapesList {
    public abstract void add(Shape s);
    public abstract void remove(int idx);
    public abstract int length();
    public abstract Shape get(int idx);
}
