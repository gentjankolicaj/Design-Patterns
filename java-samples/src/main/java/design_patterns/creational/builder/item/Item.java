package design_patterns.creational.builder.item;

import design_patterns.creational.builder.packing.Packing;

public interface Item {

    String item();

    Packing packing();

    double price();

}
