package design_patterns.creational.abstract_factory.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Shape {

    Logger LOGGER = LoggerFactory.getLogger(Shape.class);

    void draw() throws RuntimeException;

    default void defaultMethod() {
        LOGGER.error(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
    }
}
