package PizzaStore;

public class Drink {
    
    public String name;
    public double cost;
    Drink(String name,double cost)
    {
        this.cost = cost;
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public double getCost()
    {
        return this.cost;
    }
    
}
