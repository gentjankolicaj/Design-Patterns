package design_patterns.creational.abstract_factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {

    final static Logger LOGGER = LoggerFactory.getLogger(Red.class);

    @Override
    public void paint() throws RuntimeException {
        LOGGER.info(getClass().getName() + " : paint() , hashCode : " + hashCode());
    }

    @Override
    public void defaultMethod() {
        LOGGER.warn(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
    }
}
