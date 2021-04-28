package design_patterns.creational.builder.item.food;

public class Cookie extends Food {
    @Override
    public String item() {
        return "Cookie";
    }

    @Override
    public double price() {
        return 10;
    }
}
