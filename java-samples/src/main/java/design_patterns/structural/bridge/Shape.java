package design_patterns.structural.bridge;


import design_patterns.structural.bridge.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    protected abstract String draw();
}
