package PizzaStore;

public class Dessert {
    
    public String name;
    public double cost;
    Dessert(String name,double cost)
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
