package shapes.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1235);
        numbers.add(5);
        numbers.add(-45);
        numbers.add(5);
        numbers.add(15);
        numbers.add(-5);
        numbers.add(-35);
        numbers.add(45);

        int n1 = numbers.size();
        for (int i = 0; i < n1; i++) {
            if(numbers.get(i) < 0){
                numbers.remove(i);
                //i--;
            }
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            int n = it.next();
            if(n < 0){
                it.remove();
            }
        }


        printAll(numbers);

    }

    private static <T> void printAll(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
