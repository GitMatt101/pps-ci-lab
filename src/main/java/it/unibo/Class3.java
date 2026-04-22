package it.unibo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Feature 3
 * 
 * @author GitMatt101
 */
public final class Class3 {

    private Class3() {

    }

    /**
     * Entry point for Class3.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Class3.class.getName());
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Feature 3");
        }
    }
}
