package shapes.demos;

import shapes.utils.StringLengthComparator;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<String> selection = new ArrayList<>();
        SortedSet<String> names = new TreeSet<>();
        names.add("Andreas");
        names.add("Julia");
        names.add("Thomas");
        names.add("Andreas");
        names.add("Bill");

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());
        
        System.out.println(names.contains("Thomas"));

        selection.addAll(names);
        selection.addAll(names);
        Collections.sort(selection);
        for(String name : selection) {
            System.out.println(name);
        }

        //selection.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        selection.sort(new StringLengthComparator().reversed());

        for(String name : selection) {
            System.out.println(name);
        }


        /*String[] arr = selection.toArray(new String[0]);
        for(String name : selection) {
            System.out.println(name);
        }*/


    }
}
