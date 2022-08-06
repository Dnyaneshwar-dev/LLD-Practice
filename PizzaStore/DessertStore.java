package PizzaStore;

import java.util.HashMap;

public class DessertStore {
    private static HashMap<String,Dessert> desserts;
    static
    {
        desserts = new HashMap<>();
    }
    public static void addDessert(String name,double cost)
    {
        desserts.put(name, new Dessert(name,cost));
    }
    public static Dessert getDessert(String name)
    {
        return desserts.get(name);
    }
    
}