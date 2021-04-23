package design_patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {

    private final static Logger LOGGER = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() throws RuntimeException {
        LOGGER.info("Object type : " + this + ",hashCode : " + hashCode());
    }


    public String toString() {
        return this.getClass().getCanonicalName();
    }

}