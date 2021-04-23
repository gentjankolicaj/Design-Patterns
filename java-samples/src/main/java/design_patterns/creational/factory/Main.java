package design_patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {

        Factory factory = new Factory();

        Shape triangle = factory.produceShape(ShapeType.TRIANGLE);
        Shape rectangle = factory.produceShape(ShapeType.RECTANGLE);
        Shape square = factory.produceShape(ShapeType.SQUARE);
        Shape circle = factory.produceShape(ShapeType.CIRCLE);

        Shape[] array = new Shape[4];
        array[0] = triangle;
        array[1] = rectangle;
        array[2] = square;
        array[3] = circle;

        for (int i = 0; i < 4; i++) {
            LOGGER.info("Object reference index : " + i);
            array[i].draw();
        }

    }
}