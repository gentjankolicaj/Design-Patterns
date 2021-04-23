package design_patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangle implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Triangle.class);

    @Override
    public void draw() throws RuntimeException {
        LOGGER.info("Object type : " + this + ",hashCode : " + hashCode());
    }


    public String toString() {
        return this.getClass().getCanonicalName();
    }
}
