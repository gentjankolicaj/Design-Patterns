package design_patterns.creational.abstract_factory.shape;

import design_patterns.creational.abstract_factory.AbstractFactory;
import design_patterns.creational.abstract_factory.color.Color;
import design_patterns.creational.abstract_factory.color.ColorType;
import design_patterns.creational.abstract_factory.food.Food;
import design_patterns.creational.abstract_factory.food.FoodType;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType colorType) throws RuntimeException {
        throw new RuntimeException("ShapeFactory doesn't produce color.");
    }

    @Override
    public Food getFood(FoodType foodType) {
        throw new RuntimeException("ShapeFactory doesn't produce food.");
    }

    @Override
    public Shape getShape(ShapeType shapeType) throws RuntimeException {
        if (shapeType == null)
            throw new RuntimeException("Shape type is null.Must be of known type.");
        else if (shapeType.equals(ShapeType.TRIANGLE))
            return new Triangle();
        else if (shapeType.equals(ShapeType.RECTANGLE))
            return new Rectangle();
        else
            throw new RuntimeException("Shape type is unimplemented.");
    }

}
