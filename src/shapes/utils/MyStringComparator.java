package shapes.utils;

public class MyStringComparator<T> implements MyComparator<T>{

    @Override
    public int compare(T s1, T s2) {
        return s1.toString().compareTo(s2.toString());
    }
}
