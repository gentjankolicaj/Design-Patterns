package design_patterns.structural.bridge;

import design_patterns.structural.bridge.color.Blue;
import design_patterns.structural.bridge.color.Green;
import design_patterns.structural.bridge.color.Red;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Circle redCircle = new Circle(1, 1, 1, new Red());
        Circle blueCircle = new Circle(2, 2, 2, new Blue());
        Circle greenCircle = new Circle(3, 3, 3, new Green());

        LOGGER.info(redCircle.draw());
        LOGGER.info(blueCircle.draw());
        LOGGER.info(greenCircle.draw());

    }
}
