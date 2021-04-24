package design_patterns.creational.abstract_factory.color;

import design_patterns.creational.abstract_factory.AbstractFactory;
import design_patterns.creational.abstract_factory.food.Food;
import design_patterns.creational.abstract_factory.food.FoodType;
import design_patterns.creational.abstract_factory.shape.Shape;
import design_patterns.creational.abstract_factory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType colorType) throws RuntimeException {
        if (colorType == null)
            throw new RuntimeException("ColorType is null.Must be of known type.");
        if (colorType.equals(ColorType.RED)) {
            return new Red();
        } else if (colorType.equals(ColorType.BLUE)) {
            return new Blue();
        } else if (colorType.equals(ColorType.GREEN)) {
            return new Green();
        } else
            throw new RuntimeException("Color type is unimplemented");
    }

    @Override
    public Food getFood(FoodType foodType) throws RuntimeException {
        throw new RuntimeException("ColorFactory doesn't produce food.");
    }

    @Override
    public Shape getShape(ShapeType shapeType) throws RuntimeException {
        throw new RuntimeException("ColorFactory doesn't produce shape.");
    }
}
