package PizzaStore;

import java.util.HashMap;

public class ToppingStore {
    private static HashMap<String,ToppingItem> toppings;
    static
    {
        toppings = new HashMap<>();
    }
    public static void addToping(String name,double cost)
    {
        toppings.put(name, new ToppingItem(name,cost));
    }
    public static ToppingItem getToping(String name)
    {
        return toppings.get(name);
    }
    
}
