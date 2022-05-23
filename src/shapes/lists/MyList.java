package shapes.lists;

import java.util.Comparator;

public interface MyList<T> {
    void add(T s);
    void remove(int idx);
    int length();
    T get(int idx);
    void sort(Comparator<T> comparator);

    default void addAll(MyList<? extends T> elementsToAdd) {
        for (int i = 0; i < elementsToAdd.length(); i++) {
            add(elementsToAdd.get(i));
        }
    }
}
