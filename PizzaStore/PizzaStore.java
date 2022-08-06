package PizzaStore;

import java.util.ArrayList;

class Pizza extends PizzaBase{
    public Pizza(String type,double cost)
    {
        this.type = type;
        this.cost = cost;
        this.drinks = new ArrayList<>();
        this.desserts = new ArrayList<>();
        this.toppings = new ArrayList<>();
    }
    public String getType()
    {
        return this.type;
    }
    public double getCost()
    {
        return this.cost;
    }
    public double getDiscount()
    {
        if(this.desserts.size() > 0 && this.drinks.size() > 0)
        {
            return this.cost * 0.05;
        }
        return 0;
    }
    public void addSauce(String name)
    {
        this.sauce = new Sauce(name);
    }
    public void addToping(String name)
    {
        ToppingItem item = ToppingStore.getToping(name);
        this.toppings.add(item);
        cost += item.getCost();
    }
    public void addDrink(String name)
    {
        Drink drink = DrinkStore.getDrink(name);
        this.drinks.add(drink);
        cost += drink.getCost();
    }
    public void addDessert(String name)
    {
        Dessert dessert = DessertStore.getDessert(name);
        this.desserts.add(dessert);
        cost += dessert.getCost();
    }
    public void getInvoice()
    {
        System.out.println("Pizza: " + this.type);
        System.out.println("Sauce: " + this.sauce.getName());
        System.out.println("Toppings: ");
        for(ToppingItem item: this.toppings)
        {
            System.out.println(item.getName());
        }

        System.out.print("\nDrinks: ");
        for(Drink drink: this.drinks)
        {
            System.out.println(drink.getName());
        }
        System.out.println("Desserts: ");
        for(Dessert dessert: this.desserts)
        {
            System.out.println(dessert.getName());
        }

        System.out.println("Total: " + this.cost);
        System.out.println("Discount: " + this.getDiscount());

        System.out.println("Grand Total: " + (this.cost - this.getDiscount()));

    }

}


public class PizzaStore {
    public static void main(String[] args) {

        // Adding toppings store
        ToppingStore.addToping("Cheddar", 30);
        ToppingStore.addToping("Corn", 15);

        // Adding drinks to store
        DrinkStore.addDrink("Pepsi", 17);
        DrinkStore.addDrink("Coke", 20);

        // Adding desserts to store
        DessertStore.addDessert("Lava", 95);
        

        Pizza pizza = new Pizza("Regular",50);
        pizza.addSauce("Pesto sauce");
        pizza.addToping("Corn");
        pizza.addDrink("Pepsi");
        pizza.addDessert("Lava");
        pizza.getInvoice();
    }
}
