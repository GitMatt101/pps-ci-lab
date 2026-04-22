package it.unibo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Second feature.
 */
public class Class2 {

    /**
     * The word to print.
     */
    private final String word;

    /**
     * Initializes the word to print.
     */
    public Class2() {
        this.word = "world";
    }

    /**
     * Prints "Hello world"
     */
    public void print() {
        final Logger logger = Logger.getLogger(this.getClass().getName());
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Hello " + this.word);
        }
    }
}
