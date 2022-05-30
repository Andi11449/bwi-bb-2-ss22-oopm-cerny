package fridgeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Fridge {
    private SortedMap<String, Integer> ingredients = new TreeMap<>();

    public void put(String ingredient, int n){
        if(ingredients.containsKey(ingredient))
            n += ingredients.get(ingredient);
        ingredients.put(ingredient, n);
        System.out.println(n + " " + ingredient + " in fridge!");
    }

    public void take(String ingredient, int n){
        if(!ingredients.containsKey(ingredient))
            System.out.println(ingredient + " not in fridge!");
        else {
            int rest = ingredients.get(ingredient) - n;
            if(rest < 0)
                System.out.println("not enough " + ingredient + " available!");
            else {
                ingredients.put(ingredient, rest);
                System.out.println(rest + " " + ingredient + " left in fridge!");
            }
        }
    }

    public void listAll(){
        for (String key : ingredients.keySet()) {
            int value = ingredients.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
