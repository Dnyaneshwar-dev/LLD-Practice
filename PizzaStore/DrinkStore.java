package PizzaStore;

import java.util.HashMap;

public class DrinkStore {
    private static HashMap<String,Drink> drinks;
    static
    {
        drinks = new HashMap<>();
    }
    public static void addDrink(String name,double cost)
    {
        drinks.put(name, new Drink(name,cost));
    }
    public static Drink getDrink(String name)
    {
        return drinks.get(name);
    }
    
}
