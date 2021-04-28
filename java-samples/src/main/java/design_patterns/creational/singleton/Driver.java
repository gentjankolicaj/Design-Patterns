package design_patterns.creational.singleton;

public class Driver {

    private static final Driver instance = new Driver();

    private Driver() {
    }

    public static Driver getInstance() {
        return instance;
    }

    public String getDetails() {
        return getClass().getName() + " : getDetails() , hashCode " + hashCode();
    }
}
