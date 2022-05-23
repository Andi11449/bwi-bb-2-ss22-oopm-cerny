package shapes.utils;

import java.util.Comparator;

public class MyStringComparator<T> implements Comparator<T> {

    @Override
    public int compare(T s1, T s2) {
        return s1.toString().compareTo(s2.toString());
    }
}
