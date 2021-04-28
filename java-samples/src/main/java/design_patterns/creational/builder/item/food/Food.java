package design_patterns.creational.builder.item.food;

import design_patterns.creational.builder.item.Item;
import design_patterns.creational.builder.packing.Packing;
import design_patterns.creational.builder.packing.Wrapper;

public abstract class Food implements Item {

    //Override this method with specific impl
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
