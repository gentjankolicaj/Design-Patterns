package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.color.Color;
import design_patterns.creational.abstract_factory.color.ColorType;
import design_patterns.creational.abstract_factory.food.Food;
import design_patterns.creational.abstract_factory.food.FoodType;
import design_patterns.creational.abstract_factory.shape.Shape;
import design_patterns.creational.abstract_factory.shape.ShapeType;

public abstract class AbstractFactory {

    public abstract Color getColor(ColorType colorType) throws RuntimeException;

    public abstract Food getFood(FoodType foodType) throws RuntimeException;

    public abstract Shape getShape(ShapeType shapeType) throws RuntimeException;

}
