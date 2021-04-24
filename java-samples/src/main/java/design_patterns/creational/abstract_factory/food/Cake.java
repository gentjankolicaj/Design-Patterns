package design_patterns.creational.abstract_factory.food;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cake implements Food {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cake.class);

    @Override
    public void cook() throws RuntimeException {
        LOGGER.info(getClass().getName() + " : cook() , hashCode : " + hashCode());
    }


}
