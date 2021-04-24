package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.color.Color;
import design_patterns.creational.abstract_factory.color.ColorType;
import design_patterns.creational.abstract_factory.food.Food;
import design_patterns.creational.abstract_factory.food.FoodType;
import design_patterns.creational.abstract_factory.shape.FactoryType;
import design_patterns.creational.abstract_factory.shape.Shape;
import design_patterns.creational.abstract_factory.shape.ShapeType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //Create three factories
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR_FACTORY);
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
        AbstractFactory foodFactory = FactoryProducer.getFactory(FactoryType.FOOD_FACTORY);

        //Produce items using each factory
        List<Color> colors = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            colors.add(colorFactory.getColor(ColorType.RED));
            colors.add(colorFactory.getColor(ColorType.GREEN));
            colors.add(colorFactory.getColor(ColorType.BLUE));
        }

        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            shapes.add(shapeFactory.getShape(ShapeType.RECTANGLE));
            shapes.add(shapeFactory.getShape(ShapeType.TRIANGLE));
        }

        List<Food> foods = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            foods.add(foodFactory.getFood(FoodType.CAKE));
            foods.add(foodFactory.getFood(FoodType.HAMBURGER));
        }

        LOGGER.info("** ColorFactory items : ");
        for (Color color : colors) {
            color.paint();
            color.defaultMethod();
        }
        LOGGER.info("** ColorFactory items finished.");


        LOGGER.info("** ShapeFactory items : ");
        for (Shape shape : shapes) {
            shape.draw();
            shape.defaultMethod();
        }
        LOGGER.info("** ShapeFactory items finished.");


        LOGGER.info("** FoodFactory items : ");
        for (Food food : foods) {
            food.cook();
            food.defaultMethod();
        }
        LOGGER.info("** FoodFactory items finished.");


    }
}