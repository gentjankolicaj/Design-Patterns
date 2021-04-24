package design_patterns.creational.abstract_factory.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() throws RuntimeException {
        LOGGER.info(getClass().getName() + " : draw() , hashCode : " + hashCode());
    }

    @Override
    public void defaultMethod() {
        Shape.super.defaultMethod();
        LOGGER.debug(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());

    }
}
