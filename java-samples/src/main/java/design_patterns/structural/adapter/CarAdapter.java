package design_patterns.structural.adapter;

import design_patterns.structural.adapter.car.Car;

public class CarAdapter implements Machine {
    Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public String operate() {
        return "Operate -> " + car.move();
    }
}
