package design_patterns.creational.abstract_factory.food;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Food {

    Logger LOGGER = LoggerFactory.getLogger(Food.class);

    void cook() throws RuntimeException;

    default void defaultMethod() {
        LOGGER.error(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
    }
}
