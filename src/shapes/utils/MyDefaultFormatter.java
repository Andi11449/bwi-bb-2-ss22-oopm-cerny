package shapes.utils;

import shapes.entities.Shape;

public class MyDefaultFormatter<T> extends MyFormatter<T>{
    @Override
    public String format(T s) {
        return s.toString();
    }
}
