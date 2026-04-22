package it.unibo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Feature 1
 *
 * @author andreacecchini
 */
public class Class1 {

    /**
     * Field used in feature method.
     */
    private final int field;

    /**
     * Initializes field value.
     */
    public Class1() {
        this.field = 1;
    }

    /**
     * Retrieves the right feature.
     * 
     * @return a string representing the right feature.
     */
    public String method() {
        return "Feature " + this.field;
    }

    /**
     * Entry point for Class1.
     *
     * @param args not used.
     */
    public static void main(final String... args) {
        final Class1 class1 = new Class1();
        final Logger logger = Logger.getLogger(class1.getClass().getName());
        if (logger.isLoggable(Level.INFO)) {
            logger.info(class1.method());
        }
    }
}
