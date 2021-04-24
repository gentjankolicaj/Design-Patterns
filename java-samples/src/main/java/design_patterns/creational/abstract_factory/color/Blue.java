package design_patterns.creational.abstract_factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {

    final static Logger LOGGER = LoggerFactory.getLogger(Blue.class);

    @Override
    public void paint() throws RuntimeException {
        LOGGER.info(getClass().getName() + " : paint() , hashCode : " + hashCode());
    }


}
