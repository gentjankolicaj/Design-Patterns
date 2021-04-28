package design_patterns.creational.builder;

import design_patterns.creational.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;

    public Meal() {
        super();
        this.items = new ArrayList<>();
    }

    public Meal(int itemsNumber) {
        super();
        this.items = new ArrayList<>(itemsNumber);
    }

    public void setItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0.0;
        for (Item item : items)
            cost = cost + item.price();
        return cost;
    }

    public String[] getIngredients() {
        String[] ingredients = new String[items.size()];
        for (int i = 0; i < ingredients.length; i++)
            ingredients[i] = items.get(i).item();
        return ingredients;
    }

}
