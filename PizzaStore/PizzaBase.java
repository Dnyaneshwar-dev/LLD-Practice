package PizzaStore;
import java.util.ArrayList;

abstract class PizzaBase{
    public String type;
    public double cost;
    Sauce sauce;
    ArrayList<ToppingItem> toppings;
    ArrayList<Drink> drinks;
    ArrayList<Dessert> desserts;
    public abstract double getCost();
    public abstract double getDiscount();
    public abstract String getType();
    public abstract void addSauce(String name);

}
