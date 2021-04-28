package design_patterns.creational.builder;

import design_patterns.creational.builder.item.Item;

public class MealBuilderImpl implements MealBuilder {
    private Meal meal;

    public MealBuilderImpl() {
        super();
    }

    @Override
    public MealBuilder addItem(Item item) {
        if (meal == null)
            meal = new Meal();

        meal.setItem(item);
        return this;
    }


    @Override
    public Meal buildMeal() {
        Meal oldMeal = this.meal;

        //New instance for upcoming new meal
        this.meal = new Meal();
        return oldMeal;
    }
}
