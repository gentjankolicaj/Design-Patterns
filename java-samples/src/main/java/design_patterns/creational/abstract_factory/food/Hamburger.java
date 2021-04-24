package design_patterns.creational.abstract_factory.food;

public class Hamburger implements Food {

    @Override
    public void cook() throws RuntimeException {
        LOGGER.info(getClass().getName() + " : cook() , hashCode : " + hashCode());
    }


}
