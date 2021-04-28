package design_patterns.creational.builder;

import design_patterns.creational.builder.item.drink.RedBull;
import design_patterns.creational.builder.item.drink.Tea;
import design_patterns.creational.builder.item.food.Cookie;
import design_patterns.creational.builder.item.food.Egg;
import design_patterns.creational.builder.item.food.Hamburger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilderImpl();

        Meal breakfast = mealBuilder.addItem(new Tea())
                .addItem(new Egg())
                .addItem(new Cookie())
                .buildMeal();

        Meal lunch = mealBuilder.addItem(new Egg())
                .addItem(new Hamburger())
                .addItem(new RedBull())
                .buildMeal();


        LOGGER.warn("Breakfast meal : ");
        LOGGER.info("Costs " + breakfast.getCost() + ", ingredients : " + Arrays.toString(breakfast.getIngredients()));

        LOGGER.warn("Lunch meal : ");
        LOGGER.info("Costs " + lunch.getCost() + ", ingredients : " + Arrays.toString(lunch.getIngredients()));
    }
}
