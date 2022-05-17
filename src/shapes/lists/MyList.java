package shapes.lists;

import shapes.entities.Shape;

public interface MyList<T> {
    void add(T s);
    void remove(int idx);
    int length();
    T get(int idx);
}
