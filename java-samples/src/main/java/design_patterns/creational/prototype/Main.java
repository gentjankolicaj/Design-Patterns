package design_patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        FoodCache.loadCache();

        //Get different foods
        Food food1 = FoodCache.getFood(1);
        Food food0 = FoodCache.getFood(0);

        Food food13 = FoodCache.getFood(13);
        Food food17 = FoodCache.getFood(17);

        LOGGER.info("Details : ");
        LOGGER.info(Arrays.toString(food0.details()));
        LOGGER.info(Arrays.toString(food1.details()));
        LOGGER.info(Arrays.toString(food13.details()));
        LOGGER.info(Arrays.toString(food17.details()));

    }
}
