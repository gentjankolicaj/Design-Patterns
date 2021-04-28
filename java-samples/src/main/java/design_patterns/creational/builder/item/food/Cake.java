package design_patterns.creational.builder.item.food;


public class Cake extends Food {
    @Override
    public String item() {
        return "Cake";
    }

    @Override
    public double price() {
        return 80;
    }
}
