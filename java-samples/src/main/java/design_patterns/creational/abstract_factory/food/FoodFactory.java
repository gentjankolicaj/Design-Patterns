package design_patterns.creational.abstract_factory.food;

import design_patterns.creational.abstract_factory.AbstractFactory;
import design_patterns.creational.abstract_factory.color.Color;
import design_patterns.creational.abstract_factory.color.ColorType;
import design_patterns.creational.abstract_factory.shape.Shape;
import design_patterns.creational.abstract_factory.shape.ShapeType;

public class FoodFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType colorType) throws RuntimeException {
        throw new RuntimeException("FoodFactory doesn't produce color.");
    }

    @Override
    public Food getFood(FoodType foodType) throws RuntimeException {
        if (foodType == null)
            throw new RuntimeException("FoodType is null.Must be of known type.");
        else if (foodType.equals(FoodType.CAKE))
            return new Cake();
        else if (foodType.equals(FoodType.HAMBURGER))
            return new Hamburger();
        else
            throw new RuntimeException("FoodType is unimplemented.");
    }

    @Override
    public Shape getShape(ShapeType shapeType) throws RuntimeException {
        return null;
    }
}
