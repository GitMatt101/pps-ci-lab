package it.unibo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class used to test {@link Class1}.
 */
class Class1Test {

    /**
     * Test class.
     */
    private final Class1 class1;

    /**
     * Initializes {@code class1}.
     */
    /* package */ Class1Test() {
        this.class1 = new Class1();
    }

    /**
     * Checks if {@code class1.method()} works correctly.
     */
    @Test
    void testShouldReturnRightFeature() {
        assertEquals("Feature 1", class1.method(), "Method did not return 'Feature 1'");
    }
}
