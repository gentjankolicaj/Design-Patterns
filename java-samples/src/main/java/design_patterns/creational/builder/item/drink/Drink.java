package design_patterns.creational.builder.item.drink;

import design_patterns.creational.builder.item.Item;
import design_patterns.creational.builder.packing.Bottle;
import design_patterns.creational.builder.packing.Packing;

public abstract class Drink implements Item {


    //Override this method with specific Packing impl
    @Override
    public Packing packing() {
        return new Bottle();
    }

}
