package shapes.demos;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Andreas");
        names.add("Julia");
        names.add("Thomas");
        names.add("Andreas");

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println(names.size());
        
        System.out.println(names.contains("Thomas"));
    }
}
