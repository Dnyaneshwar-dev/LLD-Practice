package PizzaStore;

public class ToppingItem {
    public String name;
    public double cost;

    public ToppingItem(String name,double cost)
    {
        this.name = name;
        this.cost = cost;

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
