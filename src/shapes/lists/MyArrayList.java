package shapes.lists;

import shapes.entities.Shape;
import shapes.utils.MyComparator;

import java.lang.reflect.Array;
import java.util.Comparator;

public class MyArrayList<T> implements MyList<T>{
    private T[] data;
    private int nextIdx;

    public MyArrayList() {
        // data = new Shape[4];
        nextIdx = 0;
    }

    public void add(T s) {
        ensureCapacity(nextIdx, s);
        // if (nextIdx >= data.length)
        //    ensureCapacity(data.length*2);

        data[nextIdx] = s;
        nextIdx++;
    }

    public void remove(int idx){
        for (int i = idx; i < nextIdx-1; i++) {
            data[i] = data[i+1];
        }

        nextIdx--;
    }

    private void ensureCapacity(int length, T s) {
        if (length == 0) {
            data = (T[]) Array.newInstance(s.getClass(), 4);
            return;
        }

        if(length >= data.length) {
            //T[] newData = new T[length*2];
            T[] newData = (T[]) Array.newInstance(s.getClass(), length * 2);
            for (int i = 0; i < nextIdx; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }
    }

    public T get(int idx) {
        if(idx < 0 || idx >= nextIdx)
            return null;
        return data[idx];
    }

    @Override
    public void sort(Comparator<T> comparator) {
        boolean swapped;
        int i = 0;
        do{
            swapped = false;
            for(int k=1; k<length()-i; k++){
                if(comparator.compare(data[k-1], data[k]) > 0 ){
                    T tmp = data[k];
                    data[k] = data[k-1];
                    data[k-1] = tmp;
                    swapped = true;
                }
            } i++;
        }while(swapped);
    }

    public int length(){
        return nextIdx;
    }
}
