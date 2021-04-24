package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.color.ColorFactory;
import design_patterns.creational.abstract_factory.food.FoodFactory;
import design_patterns.creational.abstract_factory.shape.FactoryType;
import design_patterns.creational.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) throws RuntimeException {
        if (factoryType == null)
            throw new RuntimeException("FactoryType is null.Must be of known type.");
        else if (factoryType.equals(FactoryType.COLOR_FACTORY))
            return new ColorFactory();
        else if (factoryType.equals(FactoryType.FOOD_FACTORY))
            return new FoodFactory();
        else if (factoryType.equals(FactoryType.SHAPE_FACTORY))
            return new ShapeFactory();
        else
            throw new RuntimeException("Factory type is unimplemented.");
    }
}
