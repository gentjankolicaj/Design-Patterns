package design_patterns.creational.abstract_factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Color {

    Logger LOGGER = LoggerFactory.getLogger(Color.class);

    void paint() throws RuntimeException;

    default void defaultMethod() {
        LOGGER.error(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
    }
}
