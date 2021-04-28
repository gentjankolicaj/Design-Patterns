package design_patterns.creational.builder;

import design_patterns.creational.builder.item.Item;

public interface MealBuilder {

    MealBuilder addItem(Item item);

    Meal buildMeal();

}
